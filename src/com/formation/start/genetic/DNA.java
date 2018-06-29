package com.formation.start.genetic;

import com.formation.start.genetic.Nucleobase;

import java.util.ArrayList;

public class DNA extends NucleicAcid {

    public DNA(){}

    public DNA(String strand){
        super(strand);
        if (strand.contains("U")){
            System.out.println("Error: 'U' can not be in DNA");
        }
    }

    public DNA(NucleicAcid nucleicAcid){
        this.setStrand(nucleicAcid.getStrand());
    }

    public DNA getComplementary(){
        NucleicAcid na = new NucleicAcid();
        na.setStrand(this.getStrand());
        NucleicAcid cna = na.getComplementary(false);
        return new DNA(cna);

    }

    public RNA transcipt(){
        return new RNA(this.getComplementary(true));
    }

}
