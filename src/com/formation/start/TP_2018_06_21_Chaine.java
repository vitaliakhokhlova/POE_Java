package com.formation.start;

import java.util.Scanner;

public class TP_2018_06_21_Chaine {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);// pour lire un variable sur le clavier

		System.out.println("Entrez un string initial");
		String s = sc.nextLine(); // lire un string sur le clavier
		System.out.println("Entrez un string à chercher");
		String t = sc.nextLine(); // lire un string sur le clavier

		boolean contient = false;
		for (int i = 0; i < s.length() - t.length(); i++) {
			if (s.charAt(i) == t.charAt(0)) {
				for (int j = 1; j < t.length(); j++) {
					if (s.charAt(i + j) == t.charAt(j))
						contient = true;
					else {
						contient = false;
						break;
					}
				}
			}
		}
		String neContient = "";
		if (!contient)
			neContient = "ne";
		System.out.println("La chaine " + s + " " + neContient + " contient '" + t + "'");
		sc.close();

		// même chose 2ieme solution

	}

}
