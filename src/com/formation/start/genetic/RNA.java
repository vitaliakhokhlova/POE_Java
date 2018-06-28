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

    public RNA(){};

    public RNA(String strand) {
        for (char c : strand.toCharArray()) {
            this.strand.add(new Nucleobase(c));
        }
    }

    public RNA(ArrayList<Nucleobase> strand) {
        for (Nucleobase n : strand) {
            this.strand.add(n);
        }
    }

    @Override
    public String toString() {
        String s = "";
        for(Nucleobase n : strand){
            s += n.getSymbol();
        }

        return s;
    }

    public ArrayList<AminoAcid> translate() {
        ArrayList<AminoAcid> aminoAcidsList = new ArrayList<>();

        for (String c : this.codonList()) {
            aminoAcidsList.add(translateCodon(c));
        }
        return aminoAcidsList;
    }

    public ArrayList<String> codonList(){
        ArrayList<String> codonList = new ArrayList<>();

        for (int i = 0; i < strand.size(); i += 3) {
            if(i+3 <= strand.size()) {
                codonList.add(this.toString().substring(i, i + 3));
            }
        }
        return codonList;
    }

    public AminoAcid translateCodon(String codon) {
        return new AminoAcid(codonMap.get(codon));
    }

    public void setStrand(Nucleobase n) {
        strand.add(n);
    }
}
