package com.formation.start;

import java.util.ArrayList;

public class TP_2018_06_25_PrimeNumbers {

	public static void main(String[] args) {
		int[] x = { 1, 2, 3, 4, 0, 6, 7, 8, -2 };
		ArrayList<Integer> list = new ArrayList<>();
		list = getPrimeNumbers(x);
		System.out.println(list);
	}

	public static ArrayList<Integer> getPrimeNumbers(int[] numbers) {

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
}
