package com.formation.start.genetic;

public class Genetics {

    public static void main(String[] args) {

        Nucleobase nucleobase = new Nucleobase('G');
        System.out.println(nucleobase);

        DNA dna = new DNA("AGTCGTAAA");
        System.out.println("ADN: " + dna);
        DNA sdna = dna.getComplementary();
        System.out.println("Son ADN complementaire: " + sdna);

        RNA rna = dna.transcipt();
        System.out.println("Son ARN: " + rna);
        System.out.println("Les codons de l'ARN: " +rna.codonList());
        System.out.println("Les acides aminés de l'ARN: " + rna.translate());

    }
}
