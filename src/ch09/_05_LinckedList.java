package ch09;

import java.util.Collections;
import java.util.LinkedList;

public class _05_LinckedList {
    public static void main(String[] args){

        LinkedList<String> list = new LinkedList<>();

        list.add("유재석");
        list.add("하하");
        list.add("정준하");
        list.add("정형돈");
        list.add("박명수");
        list.add("노홍철");


        for(String s : list){
            System.out.println(s);
        }

        System.out.println("--------------");
        list.add(1, "강호동");
        for(String s : list){
            System.out.println(s);
        }

        list.set(0, "이수근");
        System.out.println(list);
        System.out.println(list.get(0));

        if(list.contains("박명수")){
            System.out.println("수강신청 성공");
            System.out.println(list.indexOf("박명수"));
        }

        Collections.sort(list);

        System.out.println(list);
//        list.clear();
//        System.out.println(list);
    }
}
