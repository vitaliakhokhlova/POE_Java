package com.formation.start.genetic;

public class TP20180628 {

    public static void main(String[] args) {

        Nucleobase nucleobase = new Nucleobase('G');
        System.out.println(nucleobase);

        DNA dna = new DNA("AGTCGTAAA");
        System.out.println(dna);
        System.out.println(dna.getComplementary());
        System.out.println(dna.getTranscription());

        RNA rna = new RNA(dna.getTranscription());
        System.out.println(rna);
        System.out.println(rna.translate());
    }
}
