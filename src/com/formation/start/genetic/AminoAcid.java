package com.formation.start.genetic;

import java.util.*;

public class AminoAcid {

    private Character symbol;

    private HashMap<Character, String> aaMap = new HashMap<Character, String>(){{
        put('A',"Alanine");
        put('L',"Leucine");
    }};

    public AminoAcid(Character symbol){
        this.symbol =  Character.toUpperCase(symbol);
    }

    public String getName() {
        return aaMap.get(this.symbol);
    }

    public Character getSymbol() {
        return symbol;
    }

    @Override
    public String toString() {
        return getSymbol().toString();
    }
}
