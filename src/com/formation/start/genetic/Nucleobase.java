package com.formation.start.genetic;

import java.util.*;

public class Nucleobase {

    private Character symbol;

    private ArrayList<Character> symbolList = new ArrayList<Character>(Arrays.asList('A','C','T','G','U'));
    private ArrayList<String> nameList = new ArrayList<String>(Arrays.asList("Adenine","Cytosine","Thymine","Guanine","Uracil"));

    public Nucleobase(Character symbol){
        symbol = Character.toUpperCase(symbol);
        if(symbolList.contains(symbol)){
            this.setSymbol(symbol);
        }
        else{
            System.out.println("Error: No nucleobase with this symbol");
        }
    }

    @Override
    public String toString() {
        return "Nucleobase{" +
                "symbol=" + getSymbol() +
                '}';
    }

    public Character getSymbol() {
        return symbol;
    }

    public void setSymbol(Character symbol) {
        this.symbol = symbol;
    }

    public String getName() {
        return nameList.get(symbolList.indexOf(symbol));
    }

    public String getFamily() {
        String family;
        if(symbol.equals("A") || symbol.equals('G')){
            family = "Purine";
        }
        else{
            family = "Pyrimidine";
        }
        return family;
    }


    public char getComplementary(boolean RNA) {
        char complementary = ' ';
        if(RNA && (symbol=='A')){
            complementary = 'U';
        }
        else {
            complementary = symbolList.get((symbolList.indexOf(symbol) + 2) % 4);
        }
        return  complementary;
    }


}
