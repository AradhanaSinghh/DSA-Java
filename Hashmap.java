package com.company;

import java.util.HashMap;
import java.util.Map;

public class Hashmap {
    public static void main(String[] args) {
        HashMap<String,Integer> map=new HashMap<>();
        //Insertion
        map.put("Integer",120);
        map.put("US",30);
        map.put("china",150);
        System.out.println(map);
//        for(Map.Entry<String,Integer> e: map.entrySet()){
//            System.out.println(e.getKey());
//            System.out.println(e.getValue());
//        }
        System.out.println(map.getOrDefault("china",1));
    }
}
