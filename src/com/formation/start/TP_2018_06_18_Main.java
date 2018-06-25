package com.formation.start;

public class TP_2018_06_18_Main {

	public static void main(String[] args) {

		int a = 6;
		final double b = 9;
		String s = "chaine";

		System.out.println("a=" + a);
		System.out.println("b=" + b);
		System.out.println("s=" + s);

		double produit = a * b;
		double division = b / a;
		System.out.println("produit=" + produit);
		System.out.println("division=" + division);
		String t = s + " de caracteres";
		System.out.println("t=" + t);

		boolean paire_bool = ((b % 2 == 0) || (a % 2 == 0));
		String paire_string = (paire_bool ? "paire" : "impaire");
		System.out.println("paire_bool=" + paire_bool);
		System.out.println("paire_string=" + paire_string);

		// b=3;
	}
}
