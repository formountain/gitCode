package ch09;

import ch09.Coffee.*;
import ch09.User.User;
import ch09.User.VipUser;

public class _02_GenericClass {
    public static void main(String[] args){
        CoffeByNumber c1 = new CoffeByNumber(33);
        c1.ready();
        CoffeeByNickname c2 = new CoffeeByNickname("윤도현");
        c2.ready();
        System.out.println("------------------");

        CoffeeByName c4 = new CoffeeByName("나현성");
        c4.ready();
        CoffeeByName c3 = new CoffeeByName(51);
        c3.ready();
        System.out.println("------------------");
        int c3Name = (int)c3.name;
        System.out.println(c3Name);
        String c4Number = (String)c4.name;
        System.out.println(c4Number);

//        c4Name = (String)c3.name;

        Coffee<Integer> coffee1 = new Coffee(12);
        Coffee<String> coffee2 = new Coffee("YB");
        coffee1.ready();
        coffee2.ready();

        System.out.println("------");
        int coffee1Name = coffee1.name;
        String coffee2Name = coffee2.name;
        System.out.println(coffee1Name);
        System.out.println(coffee2Name);

        System.out.println("------------------");
        CoffeeByUser<User> c7 = new CoffeeByUser<>(new User("나의성"));
        //<>안에 타입을 왜 User를 넣었는지 이해 못함
        c7.ready();

        CoffeeByUser<User> c8 = new CoffeeByUser(new VipUser("헬로"));
        c8.ready();

//        CoffeeByUser<User> c9 = new CoffeeByUser<>(new BlackBox());
        // CoffeeByUser에서 user 또는 user를 상속받은 클래스만 들어올 수 있게 하였다. 그래서 BlackBox 클래스는 못들어온다.

        System.out.println("------------------");

        orderCoffee("김태욲");
        orderCoffee(100);
        System.out.println("------------------");
        orderCoffee(87, "라떼");

    }

    public static <T> void orderCoffee(T name){
        System.out.println("커피 준비 완료 : " + name);
    }
    public static <T, V> void orderCoffee(T name, V coffee){
        System.out.println(coffee + "준비 완료 : " + name);
    }

}

class BlackBox{

}

