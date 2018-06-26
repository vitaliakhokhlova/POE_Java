package com.formation.start;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;


public class Cours_2018_06_26 {
    public static void main(String[] args) {
    ArrayList<Integer> list = new ArrayList<>();
    list.add(1);
    list.add(3);
    list.add(6);
    list.add(8);
    list.remove(3);
    System.out.println  (list.toString());
    list.add(2,9);
        System.out.println(list);

        ArrayList<String> list2 = new ArrayList<>(Arrays.asList("5","4","8"));
        System.out.println(list2);
        System.out.println(somme(list));
        System.out.println(max(list));
        System.out.println(min(list));
        System.out.println(mean(list));
        System.out.println(inverserString(list2));

        System.out.println(inverserInt(list));
        System.out.println(list);
}

public static int somme(ArrayList<Integer> list){
        int somme=0;
        for(int l : list) somme+=l;
        return somme;
}

    public static int max(ArrayList<Integer> list){
        int max=Integer.MIN_VALUE;
        for(int l : list) {
            if(l>max) max=l;
        }
        return max;
    }

    public static int min(ArrayList<Integer> list){
        int min=Integer.MAX_VALUE;
        for(int l : list) {
            if(l<min) min=l;
        }
        return min;
    }

    public static double mean(ArrayList<Integer> list){
        return (double)somme(list)/list.size();
    }

    public static ArrayList<Integer> getPrimeNumbers(ArrayList<Integer> numbers) {

        ArrayList<Integer> list = new ArrayList<>();
        for (int n : numbers)
            if (isPrime(n))
                list.add(n);
        return list;
    }

    public static boolean isPrime(int number) {

        if (number < 2)
            return false;

        for (int i = 2; i <= Math.sqrt((double) number); i++) {
            if (number % i == 0)
                return false;

        }

        return true;
    }

    public static ArrayList<String> inverserString(ArrayList<String> list){
        for(int i=list.size()-1;i>=0; i--){
            list.add(list.get(i));
            list.remove(list.get(i));
        }
        return list;
    }

    public static ArrayList<Integer> inverserInt(ArrayList<Integer> list){
        for(int i=list.size()-1;i>=0; i--){
            list.add(list.get(i));
            list.remove(list.get(i));
        }
        return list;
    }

}
