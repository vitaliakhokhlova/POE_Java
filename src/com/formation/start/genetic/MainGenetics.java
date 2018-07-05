package com.formation.start.genetic;

import java.io.IOException;
import java.util.List;

public class MainGenetics {

    public static final String path = "src/com/formation/start/genetic/";
    public static final String uri = path + "dna.txt";

    public static void main(String[] args) throws IOException {

        ImportFile file = new ImportFile(uri," ");
        String adnString = file.getData()[0][0];

        DNA dna = new DNA(adnString);
        System.out.println("DNA:" + dna);
        RNA rna = dna.transciptRNA();
        System.out.println("RNA:" + rna);

        Ribosome ribosome = new Ribosome();
        //ArrayList<AminoAcid> aaList = Ribosome.translate(rna);
        //System.out.println("Aminoacids:" + aaList);
        List<Polypeptide> polypeptideList = Ribosome.factory(rna);
        int i = 0;
        for(Polypeptide p : polypeptideList) {
            System.out.println("Peptide" + (i++) + ": " + p);
        }
            }
}
