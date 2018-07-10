package general.genetic;

import java.util.ArrayList;
import java.util.Arrays;

public class Nucleotide {

    private Character symbol;

    private ArrayList<Character> symbolList = new ArrayList<Character>(Arrays.asList('A', 'C', 'T', 'G', 'U'));
    private ArrayList<String> nameList = new ArrayList<String>(Arrays.asList("Adenine", "Cytosine", "Thymine", "Guanine", "Uracil"));

    public Nucleotide(Character symbol) {
        symbol = Character.toUpperCase(symbol);
        if (symbolList.contains(symbol)) {
            this.setSymbol(symbol);
        } else {
            throw new IllegalArgumentException("Error: No nucleobase with this symbol");
        }
    }

    @Override
    public String toString() {
        return "Nucleotide{" +
                "symbol=" + symbol +
                ", name=" + getName() +
                ", family=" + getFamily() +
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
        if (symbol.equals("A") || symbol.equals('G')) {
            family = "Purine";
        } else {
            family = "Pyrimidine";
        }
        return family;
    }

    public Nucleotide getComplementary(boolean RNA) {
        Nucleotide complementary;
        if (RNA && (symbol == 'A')) {
            complementary = new Nucleotide('U');
        } else if (RNA && (symbol == 'U')) {
            complementary = new Nucleotide('A');
        } else {
            complementary = new Nucleotide(symbolList.get((symbolList.indexOf(symbol) + 2) % 4));
        }
        return complementary;
    }

}
