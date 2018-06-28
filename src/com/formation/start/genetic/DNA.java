package com.formation.start.genetic;

import com.formation.start.genetic.Nucleobase;

import java.util.ArrayList;

public class DNA {

    private ArrayList<Nucleobase> strand = new ArrayList<>();

    public DNA(String strand){
        for(int i=0; i < strand.length(); i++) {
            Nucleobase nucleobase = new Nucleobase(strand.charAt(i));
            this.strand.add(nucleobase);
        }
    }

    public String getComplementary(){
        String complementary = "";
        for(Nucleobase n : strand){
            complementary += n.getComplementary(false);
        }
        return complementary;
    }

    public String getTranscription(){
        String transcription = "";
        for(Nucleobase n : strand){
            transcription += n.getComplementary(true);
        }
        return transcription;
    }

    @Override
    public String toString() {
        return "DNA{" +
                "strand='" + strand + '\'' +
                '}';
    }
}
