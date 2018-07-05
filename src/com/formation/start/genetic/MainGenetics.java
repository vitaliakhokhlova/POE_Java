package com.formation.start.genetic;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class MainGenetics {

    public static final String path = "src/com/formation/start/genetic/";
    public static final String uri = path + "dna.txt";

    public static void main(String[] args) throws IOException {


        /*BufferedReader reader = new BufferedReader(new FileReader(uri));
        String adnString = reader.readLine();
        reader.close();*/

        ImportFile file = new ImportFile(uri," ");
        List<ArrayList<String>> matrix = file.getMatrix();
        String adnString = matrix.get(0).get(0);

        DNA dna = new DNA(adnString);
        System.out.println("DNA:" + dna);
        RNA rna = dna.transciptRNA();
        System.out.println("RNA:" + rna);

        Ribosome ribosome = new Ribosome();
        ArrayList<AminoAcid> aaList = Ribosome.translate(rna);
        System.out.println("Aminoacids:" + aaList);
        List<Polypeptide> polypeptideList = Ribosome.factory(aaList);
        int i = 0;
        for(Polypeptide p : polypeptideList) {
            System.out.println("Peptide" + (i++) + ": " + p);
        }
            }
}
