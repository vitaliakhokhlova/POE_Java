package com.formation.start.genetic;

import java.util.ArrayList;

public class Polypeptide {

    private ArrayList<AminoAcid> chain = new ArrayList<>();

    public ArrayList<AminoAcid> getChain() {
        return chain;
    }

    public void addPolypeptide(AminoAcid aa) {
        this.chain.add(aa);
    }

    @Override
    public String toString() {
        String s = "";
        for(AminoAcid a : chain){
            s += a.getSymbol();
        }
        return s;
    }
}
