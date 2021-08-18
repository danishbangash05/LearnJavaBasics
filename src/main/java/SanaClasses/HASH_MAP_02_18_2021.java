package SanaClasses;

import java.util.HashMap;

public class HASH_MAP_02_18_2021 {
    public static void main(String[] args) {
        HashMap<String, Integer> myMap= new HashMap<String, Integer>();
        myMap.put("Danish", 1234);
        myMap.put("Hamza", 1234);
        myMap.put("Kanta", 1235);
        myMap.put("Khairul", 1236);
        myMap.put("Khairul", 1236);
        System.out.println(myMap);
        System.out.println(myMap.size());
    }
}
