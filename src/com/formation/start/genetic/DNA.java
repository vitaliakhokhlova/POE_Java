package com.formation.start.genetic;

import com.formation.start.genetic.Nucleobase;

import java.util.ArrayList;

public class DNA {

    private ArrayList<Nucleobase> strand = new ArrayList<>();

    public DNA(){};

    public DNA(String strand){
        for(char c : strand.toCharArray()) {
            this.strand.add(new Nucleobase(c));
            if (c == 'U'){
                System.out.println("Error: 'U' can not be in DNA");
            }
        }
    }

    public DNA getComplementary(){
        DNA dna = new DNA();
        for(Nucleobase n : strand){
            dna.strand.add(n.getComplementary(false));
        }
        return dna;
    }

    public RNA getTranscription(){
        RNA rna = new RNA();
        for(Nucleobase n : strand){
            rna.setStrand(n.getComplementary(true));
        }
        return rna;
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
