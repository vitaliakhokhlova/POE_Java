package com.formation.start.calendrier;

public enum Mois 
{
	JANVIER, FEVRIER(28), MARS, AVRIL(30), MAIS,JUIN(30),JUILLET, AOUT,SEPTEMBRE(30),OCTOBRE,NOVEMBRE(30),DECEMBRE;

		public int nJours;
		Mois()
		{
			this.nJours=31;
		}
		Mois(int nJours)
		{
			this.nJours = nJours;
			}	   
	
		
}
