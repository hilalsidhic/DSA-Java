package com;

import java.util.*;

public class Hashmapall {
    public static void main(String[] args) {
        Hashmapall h1 = new Hashmapall();
        HashMap<String, Integer> map = new HashMap<>();
        h1.addToMap(map);
        h1.search("Mila", map);
        h1.iterationHash(map);
        h1.removeHash(map);
    }

    public void addToMap(HashMap<String, Integer> map) {
        map.put("Hilal", 1);
        map.put("Mila", 2);
        map.put("Bilal", 3);
        map.put("Al", 4);
        map.put("Mila",7);
        System.out.println(map);
    }

    public void search(String key, HashMap<String, Integer> map) {
        if (map.containsKey(key)) {
            System.out.println(key + " found");
        } else
            System.out.println("not found");

        System.out.println(map.get(key));
    }

    public void iterationHash(HashMap<String, Integer> map) {
        for (Map.Entry<String, Integer> e : map.entrySet()) {
            System.out.println(e);
        }
        Set<String> keys = map.keySet();
        for (String key : keys) {
            System.out.println(key + " " + map.get(key));
        }
    }

    public void removeHash(HashMap<String, Integer> map) {
        map.remove("Hilal");
        System.out.println(map);
    }
}