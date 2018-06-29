package com.formation.start.genetic;

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

    public DNA getComplementaryDNA(){
        return new DNA(this.getComplementary(false));
    }

    public RNA transciptRNA(){
        return new RNA(this.getComplementary(true));
    }

}
