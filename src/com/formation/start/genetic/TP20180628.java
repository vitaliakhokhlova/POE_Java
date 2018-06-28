package com.formation.start.genetic;

public class TP20180628 {

    public static void main(String[] args) {

        Nucleobase nucleobase = new Nucleobase('G');
        System.out.println(nucleobase);

        DNA dna = new DNA("AGTCGTAAA");
        System.out.println(dna);
        DNA sdna = dna.getComplementary();
        System.out.println(sdna);

       RNA rna = dna.getTranscription();
       System.out.println(rna);
       System.out.println(rna.translate());
       System.out.println(rna.codonList());
    }
}
