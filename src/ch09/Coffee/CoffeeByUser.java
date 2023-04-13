package ch09.Coffee;

import ch09.User.User;

public class CoffeeByUser <T extends User>{
    public T user;

    public CoffeeByUser(T user) {
        this.user = user;
    }
    public void ready(){
        System.out.println("커피 준비 완료 : " + user.name) ;
        //user.name을 왜 하는 건지 이해를 못했다.
        //user가 User클래스를 상속하는거면 super을 써야하는거 아닌가??
        user.addPoint();
    }
}
