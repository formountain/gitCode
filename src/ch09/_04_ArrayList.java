package ch09;

import java.util.ArrayList;

public class _04_ArrayList {
    public static void main(String[] args){
        ArrayList<String> list = new ArrayList<>();

        list.add("유재석");
        list.add("노홍철");
        list.add("박명수");
        list.add("하하");
        list.add("정형돈");
        list.add("정준하");

        System.out.println(list.size());
        for(String s : list){
            System.out.println(s);
        }
        list.set(0, "이수근");
        System.out.println(list.get(0));

        System.out.println(list.indexOf("박명수")+1);
        if(list.contains("박명수")){
            System.out.println("수강신청 성공");
        }else{
            System.out.println("수강신청 실패");
        }
        list.clear();
        if(list.isEmpty()){
            System.out.println("비어있음"+list.size());
        }else{
            System.out.println("아직 남아있음");
        }
        list.add("유재석");
        list.add("노홍철");
        list.add("박명수");
        list.add("하하");
        list.add("정형돈");
        list.add("정준하");
    }
}
