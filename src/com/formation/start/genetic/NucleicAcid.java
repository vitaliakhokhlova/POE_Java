package com.formation.start.genetic;

import java.util.ArrayList;

public class NucleicAcid {

    private ArrayList<Nucleobase> strand = new ArrayList<>();
    private boolean ARN = false;

    public NucleicAcid(String strand, boolean ARN){
        if (strand.contains("U") && !ARN){
            System.out.println("Error: 'U' can not be in DNA");
        }
        if (strand.contains("T") && ARN){
            System.out.println("Error: 'T' can not be in RNA");
        }
        for(char c : strand.toCharArray()) {
            this.strand.add(new Nucleobase(c));
        }


    }

    public NucleicAcid(){}


    public ArrayList<Nucleobase> getStrand() {
        return strand;
    }

    public void setStrand(ArrayList<Nucleobase> strand) {
        this.strand = strand;
    }

    public NucleicAcid getComplementary(boolean RNA){
        NucleicAcid acid = new NucleicAcid();
        for(Nucleobase n : this.getStrand()){
            acid.strand.add(n.getComplementary(RNA));
        }
        return acid;
    }

    @Override
    public String toString() {
        String s = "";
        for(Nucleobase n : strand){
            s += n.getSymbol();
        }

        return s;
    }
}
