package com.formation.start.genetic;

import com.formation.start.genetic.Nucleobase;

import java.util.ArrayList;

public class DNA {

    private ArrayList<Nucleobase> strand = new ArrayList<>();

    public DNA(String strand){
        for(char c : strand.toCharArray()) {
            Nucleobase nucleobase = new Nucleobase(c);
            this.strand.add(nucleobase);
            if (c == 'U'){
                System.out.println("Error: 'U' can not be in DNA");
            }
        }
    }

    public ArrayList<Nucleobase> getComplementary(){
        ArrayList<Nucleobase> complementary = new ArrayList<>();
        for(Nucleobase n : strand){
            complementary.add(n.getComplementary(false));
        }
        return complementary;
    }

    public ArrayList<Nucleobase> getTranscription(){
        ArrayList<Nucleobase> transcription = new ArrayList<>();
        for(Nucleobase n : strand){
            transcription.add(n.getComplementary(true));
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
