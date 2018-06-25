package com.formation.start;

import java.util.Locale;
import java.util.Scanner;

public class If {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);// pour lire l'entrée du clavier
		sc.useLocale(Locale.UK);// pour pouvoir rentrer les doubles avec un point au lieu d'une virgule
		System.out.println("Entrez un entier x");
		int x = sc.nextInt();//lier un entier
		
		System.out.println("Entrez un entier y");
		int y = sc.nextInt();

		// if ((x>0 && y<0) || (x>0 && y<0) )
		// la même chose avec OR exclusif (XOR)
		if (x < 0 ^ y < 0) {
			System.out.println("Le produit est négatif ");

		} else {
			System.out.println("Le produit est positif");
		}

		// la même chose en ternaire:
		System.out.println((x < 0 ^ y < 0) ? "Le produit est négatif " : "Le produit est positif ");

		sc.close();
	}

}
