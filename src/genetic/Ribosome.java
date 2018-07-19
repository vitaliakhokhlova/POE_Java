package general.genetic;

import java.util.ArrayList;
import java.util.HashMap;


public class Ribosome {

    public static final HashMap<String, Character> codonMap = new HashMap<String, Character>() {{
        put("UUU", 'F');
        put("UUC", 'F');
        put("UUA", 'L');
        put("UUG", 'L');
        put("CUU", 'L');
        put("CUC", 'L');
        put("CUA", 'L');
        put("CUG", 'L');
        put("AUU", 'I');
        put("AUC", 'I');
        put("AUA", 'I');
        put("AUG", 'M');
        put("GUU", 'V');
        put("GUC", 'V');
        put("GUA", 'V');
        put("GUG", 'V');
        put("UCU", 'S');
        put("UCC", 'S');
        put("UCA", 'S');
        put("UCG", 'S');
        put("CCU", 'P');
        put("CCC", 'P');
        put("CCA", 'P');
        put("CCG", 'P');
        put("ACU", 'T');
        put("ACC", 'T');
        put("ACA", 'T');
        put("ACG", 'T');
        put("GCU", 'A');
        put("GCC", 'A');
        put("GCA", 'A');
        put("GCG", 'A');
        put("UAU", 'Y');
        put("UAC", 'Y');
        put("UAA", ' ');
        put("UAG", ' ');
        put("CAU", 'H');
        put("CAC", 'H');
        put("CAA", 'Q');
        put("CAG", 'Q');
        put("AAU", 'N');
        put("AAC", 'N');
        put("AAA", 'K');
        put("AAG", 'K');
        put("GAU", 'D');
        put("GAC", 'D');
        put("GAA", 'E');
        put("GAG", 'E');
        put("UGU", 'C');
        put("UGC", 'C');
        put("UGA", ' ');
        put("UGG", 'W');
        put("CGU", 'R');
        put("CGC", 'R');
        put("CGA", 'R');
        put("CGG", 'R');
        put("AGU", 'S');
        put("AGC", 'S');
        put("AGA", 'R');
        put("AGG", 'R');
        put("GGU", 'G');
        put("GGC", 'G');
        put("GGA", 'G');
        put("GGG", 'G');
    }};

    private static ArrayList<AminoAcid> translate(NucleicAcid rna) {
        ArrayList<AminoAcid> aminoAcidsList = new ArrayList<>();
        for (String c : codonList(rna)) {
            aminoAcidsList.add(new AminoAcid(codonMap.get(c)));
        }
        return aminoAcidsList;
    }

    private static ArrayList<String> codonList(NucleicAcid rna) {
        ArrayList<String> codonList = new ArrayList<>();
        int n = rna.getStrand().size();
        for (int i = 0; i < n - 2; i += 3) {
            String codon = rna.getStrand().get(i).getSymbol().toString() +
                    rna.getStrand().get(i + 1).getSymbol().toString() +
                    rna.getStrand().get(i + 2).getSymbol();
            codonList.add(codon);
        }
        return codonList;
    }

    public static ArrayList<Polypeptide> factory(NucleicAcid rna) {
        ArrayList<AminoAcid> aaList = translate(rna);
        ArrayList<Polypeptide> polypeptideList = new ArrayList<>();
        Polypeptide polypeptide = new Polypeptide();
        for (AminoAcid aa : aaList) {
            if (!aa.getSymbol().equals(' ')) {
                polypeptide.addPolypeptide(aa);
            } else {
                if (polypeptide.getChain().size() > 1) {
                    polypeptideList.add(polypeptide);
                }
                polypeptide = new Polypeptide();
            }
        }
        return polypeptideList;
    }
}
