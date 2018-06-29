package com.formation.start.genetic;

import java.awt.image.AreaAveragingScaleFilter;
import java.util.ArrayList;
import java.util.HashMap;

public class RNA extends NucleicAcid {

      HashMap<String, Character> codonMap = new HashMap<>();

    {
        codonMap.put("UCA", 'S');
        codonMap.put("GCA", 'A');
        codonMap.put("UUU", 'F');
    }

    public RNA(NucleicAcid nucleicAcid){
        this.setStrand(nucleicAcid.getStrand());
    }

    public RNA(String strand){
        super(strand);
        if (strand.contains("T")){
            System.out.println("Error: 'T' can not be in RNA");
        }
    }

    public RNA getComplementary(){

        return new RNA(this.getComplementary(true));

    }

    public RNA(ArrayList<Nucleobase> strand) {
        this.setStrand(strand);
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
        int n = getStrand().size();
        for (int i = 0; i < n; i += 3) {
            if(i+3 <= n) {
                codonList.add(this.toString().substring(i, i + 3));
            }
        }
        return codonList;
    }

    public AminoAcid translateCodon(String codon) {

        return new AminoAcid(codonMap.get(codon));

    }

}
