package com.formation.start.csv;

import java.util.ArrayList;
import java.util.List;

public class Mesures extends ImportTable {

    public List<Double> getColumn(int nColumn)  {
        List<Double> column = new ArrayList<>();
        for (ArrayList<String> s : getMatrix()) {
            column.add(Double.valueOf(s.get(nColumn-1)));
        }
        return column;
    }


    public List<Double> getDifference(int nColumn, int mColumn, int order)  {
        List<Double> getDifference = new ArrayList<>();
        for (ArrayList<String> s : getMatrix()) {

            getDifference.add(Math.pow(Double.valueOf(s.get(nColumn-1))-Double.valueOf(s.get(mColumn-1)), order));
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
