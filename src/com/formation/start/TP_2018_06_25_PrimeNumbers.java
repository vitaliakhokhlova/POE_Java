package com.formation.start;

import java.util.ArrayList;
import java.util.List;
import static java.util.Arrays.*;


public class TP_2018_06_25_PrimeNumbers {

	public static void main(String[] args) {
		int[] x = {10,2,5 };
		ArrayList<Integer> list =  new ArrayList<>(asList(3,2,7));

		//list = getPrimeNumbers(x);
		//System.out.println(list);
        int i=0;
		//while(i<10) System.out.println(++i);
        int n=5;
        System.out.println(n+"!="+factorial(n));
        int [] list2=new int[]{3,2,7};
        int m=multiplication(list);
        System.out.println(m);
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

	public static int factorial(int n){
	    if (n==0||n==1) return 1;
	    else return n*factorial(n-1);
    }

    public static int multiplication (List<Integer> numbers){
	   if (numbers.size()==1) return numbers.get(0);
	   else {
          	       return numbers.get(numbers.size()-1)*multiplication(numbers.subList(0,numbers.size()-1));
	   }
       }


    //prof
    /*public static int multiplication (int[] tab, int n){
        if (n==1) return tab[0];
        else {
            return tab[n-1]*multiplication(tab, n-1);
        }
    }*/
}