package com.formation.start.genetic;

import java.awt.image.AreaAveragingScaleFilter;
import java.util.ArrayList;
import java.util.HashMap;

public class RNA extends NucleicAcid {

    public RNA(NucleicAcid nucleicAcid){
        this.setStrand(nucleicAcid.getStrand());
    }

    public RNA(String strand){
        super(strand);
        if (strand.contains("T")){
            System.out.println("Error: 'T' can not be in RNA");
        }
    }
    public DNA getADN(){
        return new DNA(this.getComplementary(true));
    }

    public RNA(ArrayList<Nucleobase> strand) {
        this.setStrand(strand);
    }


}
