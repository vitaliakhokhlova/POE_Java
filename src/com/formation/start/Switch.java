package com.formation.start;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Switch {

	public static void main(String[] args) {
		System.out.println("1) Ouvrir \n2) Quitter \n3) Sauvegarder");
		
		int choice=0;
		boolean badInput=true;
		do {
		try
		{
			Scanner scanner=new Scanner(System.in); 
			choice=scanner.nextInt();	
			 badInput=false;
		
			switch(choice)
			{
				case 1: System.out.println("Le fichier est ouvert"); break;
				case 2: System.out.println("Le fichier est fermé"); break;
				case 3: System.out.println("Le fichier est sauvegardé"); break;
				default: System.out.println("Le choix n'est pas claire");
			}
			scanner.close();
			}
		catch (InputMismatchException exception) {
            // Output unexpected InputMismatchExceptions.
			 System.out.println("L'entrée n'est pas valide. Essayez à nouveau.");
        }}while(badInput);
		

}}
