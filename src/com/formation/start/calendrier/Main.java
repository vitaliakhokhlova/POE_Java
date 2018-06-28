package com.formation.start.calendrier;

public class Main
{
	private static int rememberLastDay=0;
	public static void main(String[] args) 
	{
	System.out.println("Calendrier");
	
	for(Mois m : Mois.values())
	{
		Integer compteur=1;
		System.out.println(m);
		while(compteur < m.nJours) 
		{
			for(Semaine c : Semaine.values())
			{
				if(rememberLastDay<=c.numero)
				{
					if (compteur>m.nJours) 
						{
							rememberLastDay=c.numero;
							break;	
							
						}
					System.out.println(compteur.toString()+" " +c.toString());
					rememberLastDay=0;
					compteur++;									
			}}
		}
	}
	
}}
