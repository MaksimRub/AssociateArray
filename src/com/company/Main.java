package com.company;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class Main {

    public static void main(String[] args) {
	// write your code here
        HashMap<String,Double> purchaseMap=new HashMap<>();
        purchaseMap.put("Чипсы",50.6);
        purchaseMap.put("Хлеб",40.1);
        purchaseMap.put("Сок",37.2);
        purchaseMap.put("Мороженое",41.6);
        purchaseMap.put("Ручка",12.3);
        purchaseMap.put("Лего",2387.2);

        System.out.println(purchaseMap);

        System.out.println(purchaseMap.containsKey("Сок"));
        System.out.println(purchaseMap.containsKey("Молоко"));

        for (String s:purchaseMap.keySet()) {
            System.out.println(s+" : "+purchaseMap.get(s));
            if(s.equals("Ручка")){
                purchaseMap.replace(s,23.5);
            }
        }
        System.out.println(purchaseMap);

        for (Map.Entry<String,Double> entry:purchaseMap.entrySet()) {
            System.out.println(entry.getKey()+" : "+entry.getValue());
            if (entry.getKey().equals("Сок")){
                entry.setValue(45.7);
            }
        }
        System.out.println(purchaseMap);
        //Iterator<String> iterator=purchaseMap.keySet().iterator();

        TreeMap <String,Double> treeMap=new TreeMap<>();
        treeMap.put("Чипсы",50.6);
        treeMap.put("Хлеб",40.1);
        treeMap.put("Сок",37.2);
        treeMap.put("Мороженое",41.6);
        treeMap.put("Ручка",12.3);
        treeMap.put("Лего",2387.2);

        for (String s:treeMap.keySet()) {
            System.out.println(s+" : "+treeMap.get(s));
        }
        System.out.println(treeMap.subMap("С","Я"));


    }
}
