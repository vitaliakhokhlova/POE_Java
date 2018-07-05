package com.formation.start.csv;

import java.util.ArrayList;
import java.util.List;

public class Mesures extends ImportTable {

    public double[] getColumn(int nColumn)  {
        double[] column = new double[getnLines()];
        int i = 0;
        for (ArrayList<String> s : getMatrix()) {
            column[i++] = Double.valueOf(s.get(nColumn-1));
        }
        return column;
    }


    public double[] getDifference(int nColumn, int mColumn, int order)  {
        double[] getDifference = new double[getnLines()];
        int i = 0;
        for (ArrayList<String> s : getMatrix()) {
            getDifference[i++] = Math.pow(Double.valueOf(s.get(nColumn-1))-Double.valueOf(s.get(mColumn-1)), order);
        }
        return getDifference;
    }

    public List<Integer> getIndexDifference(int nColumn, int mColumn, int order, double delta)  {
        List<Integer> getIndexDifference = new ArrayList<>();
        double difference;
        int i = 0;
        for (ArrayList<String> s : getMatrix()) {
            difference = Math.pow(Double.valueOf(s.get(nColumn-1))-Double.valueOf(s.get(mColumn-1)), order);
            if(difference >= delta){
                getIndexDifference.add(i);
                          }
                          i++;
        }
        return getIndexDifference;
    }
}
