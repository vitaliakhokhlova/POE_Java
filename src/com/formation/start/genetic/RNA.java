package com.formation.start.genetic;

import java.util.ArrayList;
import java.util.HashMap;

public class RNA {

    private ArrayList<Nucleobase> strand = new ArrayList<>();

    HashMap<String, Character> codonMap = new HashMap<>();

    {
        codonMap.put("UCA",'S');
        codonMap.put("GCA", 'A');
        codonMap.put("UUU", 'F');
    }

    public RNA(String strand){
        for(int i=0; i < strand.length(); i++) {
            Nucleobase nucleobase = new Nucleobase(strand.charAt(i));
            this.strand.add(nucleobase);
        }
    }

    @Override
    public String toString() {
        return "RNA{" +
                "strand='" + strand + '\'' +
                '}';
    }

    public ArrayList<AminoAcid> translate(){
        ArrayList<AminoAcid> aminoAcidsList = new ArrayList<>();
        String codon = "";
        for(int i = 0; i < strand.size(); i++){
            codon += strand.get(i).getSymbol();
            if(codonMap.containsKey(codon)){
                aminoAcidsList.add(new AminoAcid(codonMap.get(codon)));
                codon = "";
            }
        }
        return aminoAcidsList;
    }
}
