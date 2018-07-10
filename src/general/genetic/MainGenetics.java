package general.genetic;

import java.io.IOException;
import java.util.List;

public class MainGenetics {

    public static final String path = "general/genetic/";
    public static final String uri = path + "dna.txt";

    public static void main(String[] args) throws IOException {

        ImportFile file = new ImportFile(uri, " ");
        String adnString = file.getData()[0][0];

        NucleicAcid dna = new NucleicAcid(adnString, false);
        System.out.println("DNA:" + dna);
        NucleicAcid rna = dna.getComplementary(true);
        System.out.println("RNA:" + rna);

        List<Polypeptide> polypeptideList = new Ribosome().factory(rna);
        int i = 0;
        for (Polypeptide p : polypeptideList) {
            System.out.println("Peptide" + (i++) + ": " + p);
        }
    }
}
