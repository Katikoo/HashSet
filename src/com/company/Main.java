package com.company;

public class Main {

    public static void main(String[] args) {

        MySet hashList = new MyHashSet();

        System.out.println(hashList.size());
        System.out.println(hashList.isEmpty());

        hashList.add("ABC");
        hashList.add("ABC");
        hashList.add(200);
        hashList.add(200);
        hashList.add("SDF");
        hashList.add(0);
        hashList.add(-45);
        System.out.println(hashList);

        hashList.remove(200);
        System.out.println(hashList);

        System.out.println(hashList.contains(473738383));
        System.out.println(hashList.contains(-45));
        System.out.println(hashList.contains("Follow"));
        System.out.println(hashList.contains("ABC"));

        System.out.println(hashList.size());
        System.out.println(hashList.isEmpty());

        hashList.clear();
        System.out.println(hashList);

        System.out.println(hashList.size());
        System.out.println(hashList.isEmpty());
    }
}