package com.company;


import java.util.*;

public class Main {

    public static void main(String[] args) {

        Random rnd = new Random();
        int [] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            int rn = rnd.nextInt(2);
            array [i] = rn;
            System.out.println("First " + array[i]);
        }

        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            int rn = rnd.nextInt(2);
            arrayList.add(rn);
            System.out.println("Second " + arrayList.get(i));
        }
        LinkedList<Integer> list = new LinkedList<>();
        for (int i = 0; i < 10; i++) {
            int rn = rnd.nextInt(2);
            list.add(rn);
            System.out.println("Third: " + list.get(i));
        }
        method(array);
        method(arrayList);
        method(list);
    }
    public static  void method(int [] array){
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
    }
    public static  void method(ArrayList<Integer> arrayList){
        Collections.sort(arrayList);
        System.out.println(arrayList);
    }
    public static  void  method(LinkedList<Integer> list){
        Collections.sort(list);
        System.out.println(list);
    }
}
