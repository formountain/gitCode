package ch09;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class _06_HashSet {
    public static void main(String[] args){
        HashSet<String> set = new LinkedHashSet<>();

        set.add("삼겹살");
        set.add("쌈장");
        set.add("음료");
        set.add("후추");
        set.add("깻잎");
        set.add("삼겹살");
        set.add("상추");
        set.add("삼겹살");

        System.out.println(set);
        System.out.println(set.size());
        for(String s : set){
            System.out.println(s);
        }

        System.out.println(set.size());
        set.remove("삼겹살");
        System.out.println(set.size());
    }
}
