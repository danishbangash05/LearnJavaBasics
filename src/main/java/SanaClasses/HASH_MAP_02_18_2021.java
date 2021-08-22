package SanaClasses;

import java.util.HashMap;

public class HASH_MAP_02_18_2021 {
    public static void main(String[] args) {
        HashMap<String, Integer> myMap= new HashMap<String, Integer>();
        HashMap<String, Integer> myMap2 = new HashMap<String,Integer>();
        myMap.put("Danish", 1234);
        myMap.put("Hamza", 1234);
        myMap.put("Kanta", 1235);
        myMap.put("Khairul", 1236);
        myMap.put("Khairul", 1236);
        System.out.println(myMap);
        System.out.println(myMap.size());
        myMap.remove("Danish");
        System.out.println(myMap);
        System.out.println(myMap.size());
        System.out.println(myMap.containsKey("Hamza"));
        myMap2.putAll(myMap);
        myMap2.put("Jadid", 123456);
        System.out.println(myMap2);
    }
}
