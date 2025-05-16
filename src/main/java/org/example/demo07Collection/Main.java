package org.example.demo07Collection;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        // Demo pour SortedSet
        HashSet<String> set = new HashSet<>();
        set.add("Java");
        set.add("Python");
        set.add("C++");
        set.add("C++");
        set.add("Python3");
        System.out.println("Hashset : "+set);

        //Demo SortedSet (ThreeSet)
        SortedSet<String> sortedSet = new TreeSet<>();
        sortedSet.add("Java");
        sortedSet.add("Python");
        sortedSet.add("C++");
        sortedSet.add("C++");
        sortedSet.add("Python3");
        System.out.println("Sortedset : "+sortedSet);

        // Methode pour Sortedset
        System.out.println("Premier element : "+sortedSet.first());
        System.out.println("dernier element : "+sortedSet.last());
        SortedSet<String> headset = sortedSet.headSet("Python");
        System.out.println("Sous ensemble avant Python :"+headset);
        SortedSet<String> tailset = sortedSet.tailSet("Javascript");
        System.out.println("sous ensemble apres Javascipt "+tailset);

        // Demo HashMap
        Map<String,Integer> hashmap = new HashMap<>();
        hashmap.put("Java",20);
        hashmap.put("Python",10);
        hashmap.put("C++",30);
        System.out.println("mon hashmap : "+hashmap);

        if (hashmap.containsKey("Java")) {
            System.out.println("la clé java existe deja");
        }
        if ((hashmap.containsKey("ToTo"))){
            System.out.println("toto existe dja");
        }else {
            hashmap.put("ToTo",58);
        }

        System.out.println("mon hashmap "+hashmap);




        // methodesp our le hashmap
        System.out.println("nbre d'element dans mon Hashmap : "+hashmap.size());
        System.out.println("Valeur associé a la clé Java : "+hashmap.get("Java"));
        System.out.println("Supr l'element avec la clé ToTo");
        hashmap.remove("ToTo");
        System.out.println("Apres suprr  : "+hashmap);


        // parcourir le hashmap

        // en utilisant les clefs
        for (String key : hashmap.keySet()) {
            System.out.println("La clé est : " + key);
            System.out.println("Et sa valeur est : "+hashmap.get(key));
        }

        // en utilisanbt les valeurs
        for (int value: hashmap.values()){
            System.out.println("ma valeur : "+value);
        }

        //parcourir avec for each
        for (Map.Entry<String,Integer> entry: hashmap.entrySet()){
            System.out.println("ma clé "+entry.getKey()+" ma valeur  "+entry.getValue());
        }




    }


}
