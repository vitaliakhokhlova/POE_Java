package com.formation.start;

import java.util.Scanner;

public class Codes {

	public static void main(String[] args) {
		
		String pays;
		System.out.println("Entrez un code du pays: UK, FR, DE, RU, ES");
		Scanner scanner=new Scanner(System.in);
		//scanner.nextLine();
		String codePays = scanner.nextLine();
		codePays=codePays.toUpperCase();
	
		/*if (codePays.equals("UK")) pays="United Kindom";
		else if (codePays.equals("FR")) pays = "France";
		else if (codePays.equals("DE")) pays = "Germany";
		else if (codePays.equals("RU")) pays = "Russia";
		else if (codePays.equals("ES")) pays = "Spain";
		else pays="le code n'est pas dans le tableau";*/
		
		// même chose en utilisant le switch
		switch (codePays) 
		{
			case "UK": pays="United Kindom"; break;
			case "FR": pays = "France"; break;
			case "DE": pays = "Germany"; break;
			case "RU": pays = "Russia"; break;
			case "ES": pays = "Spain"; break;
			default: pays="le code n'est pas dans le tableau";
		}
		
		System.out.println("Le code "+codePays+" correspond à: "+pays);
		
		scanner.close();

	}

}
