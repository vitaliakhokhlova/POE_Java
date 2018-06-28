package com.formation.start.genetic;

import java.awt.image.AreaAveragingScaleFilter;
import java.util.ArrayList;
import java.util.HashMap;

public class RNA {

    private ArrayList<Nucleobase> strand = new ArrayList<>();

    HashMap<String, Character> codonMap = new HashMap<>();

    {
        codonMap.put("UCA", 'S');
        codonMap.put("GCA", 'A');
        codonMap.put("UUU", 'F');
    }

    public RNA(String strand) {
        for (int i = 0; i < strand.length(); i++) {
            Nucleobase nucleobase = new Nucleobase(strand.charAt(i));
            this.strand.add(nucleobase);
        }
    }

    public RNA(ArrayList<Nucleobase> strand) {
        for (Nucleobase n : strand) {
            this.strand.add(n);
        }
    }

    @Override
    public String toString() {
        return "RNA{" +
                "strand='" + strand + '\'' +
                '}';
    }

    public ArrayList<AminoAcid> translate() {
        ArrayList<AminoAcid> aminoAcidsList = new ArrayList<>();
        ArrayList<String> codonList = this.codonList();
        for (String c : codonList) {
            aminoAcidsList.add(translateCodon(c));
        }
        return aminoAcidsList;
    }

    public ArrayList<String> codonList(){
        ArrayList<String> codonList = new ArrayList<>();

        for (int i = 0; i < strand.size(); i += 3) {
            String codon = "";
            for(int j = i; j<i+3; j++){
                codon += strand.get(j).getSymbol();
            }
            codonList.add(codon);
        }
        return codonList;
    }

    public AminoAcid translateCodon(String codon) {
        return new AminoAcid(codonMap.get(codon));
    }
}
