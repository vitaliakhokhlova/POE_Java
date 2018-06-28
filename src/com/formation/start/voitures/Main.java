package com.formation.start.voitures;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		boolean compare=false;
		 while (!compare) 
		 {
			System.out.println("Choisir une couleur parmi les suivants:");
			for (Couleurs c : Couleurs.values()) System.out.println(c);
			String couleur = scanner.nextLine();
			couleur=couleur.toUpperCase();
			
			for (Couleurs c : Couleurs.values())
			{
				if(couleur.equals(c.toString())) 
					{
					compare=true;		
					System.out.println("Couleur existe");
					}
			}
			if(!compare) System.out.println("La couleur n'existe pas");			
		} 		
		scanner.close();
		
		for (String arg : args) System.out.println (arg) ;
	}

}
