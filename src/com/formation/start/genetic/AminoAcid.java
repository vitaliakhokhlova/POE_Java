package com.formation.start.genetic;

import java.util.*;
import java.util.Map.Entry;

public class AminoAcid {

    private char symbol;
    private ArrayList<Character> symbolList = new ArrayList<Character>(Arrays.asList('A','F','S'));
    private ArrayList<String> nameList = new ArrayList<String>(Arrays.asList("Alanine","Phenylalanine","Serine","Guanine","Uracil"));


    public AminoAcid(Character symbol){
        symbol = Character.toUpperCase(symbol);
        if(symbolList.contains(symbol)){
            this.symbol =symbol;
        }
        else{
            System.out.println("Error: No nucleobase with this symbol");
        }
    }

    public String getName() {
        return nameList.get(symbolList.indexOf(symbol));
    }

    @Override
    public String toString() {
        return "AminoAcid{" +
                "symbol=" + symbol +
                '}';
    }
}
