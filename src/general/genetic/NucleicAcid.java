package general.genetic;

import java.util.ArrayList;

public class NucleicAcid {

    private ArrayList<Nucleotide> strand = new ArrayList<>();
    private boolean ARN = false;

    public NucleicAcid(String strand, boolean ARN) {
        if (strand.contains("U") && !ARN) {
            throw new IllegalArgumentException("Error: 'U' can not be in DNA");
        }
        if (strand.contains("T") && ARN) {
            throw new IllegalArgumentException("Error: 'T' can not be in RNA");
        }
        for (char c : strand.toCharArray()) {
            this.strand.add(new Nucleotide(c));
        }
    }


    public ArrayList<Nucleotide> getStrand() {
        return strand;
    }

    public void setStrand(ArrayList<Nucleotide> strand) {
        this.strand = strand;
    }

    public NucleicAcid getComplementary(boolean RNA) {
        NucleicAcid acid = new NucleicAcid("", RNA);
        for (Nucleotide n : this.getStrand()) {
            acid.strand.add(n.getComplementary(RNA));
        }
        return acid;
    }

    @Override
    public String toString() {
        String s = "";
        for (Nucleotide n : strand) {
            s += n.getSymbol();
        }
        return s;
    }
}
