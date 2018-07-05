package com.formation.start.genetic;

import java.util.*;

public class AminoAcid {

    private Character symbol;
    private HashMap<Character, String> aaMap = new HashMap<>();
    {
        aaMap.put('A',"Alanine");
        aaMap.put('L',"Leucine");
    }

    public AminoAcid(Character symbol){
        symbol = Character.toUpperCase(symbol);
        this.symbol = symbol;
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
