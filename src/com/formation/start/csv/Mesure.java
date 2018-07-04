package com.formation.start.csv;

import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.*;
import java.lang.Math;

public class Mesure implements IMesureRepository {

    BufferedReader reader;
    int nLines;
    int nColumns;
    List<ArrayList<Double>>  matrix = new ArrayList();

    public List<ArrayList<Double>> getMatrix() {
        return matrix;
    }

    @Override
    public void load(String uri, String separator) throws IOException, ParseException {
        this.reader = new BufferedReader(new FileReader(uri));
        reader.readLine();
        String line;
        int i = 0;
        NumberFormat format = NumberFormat.getInstance(Locale.FRANCE);
        while ((line = reader.readLine()) != null) {
            ArrayList <Double> row=new ArrayList<>();
            String[] rowString = line.split(separator);
            this.nColumns = rowString.length;
            for (int j = 0; j < nColumns; j++){
                Number number = format.parse(rowString[j]);
                row.add(number.doubleValue());
            }
            i++;
            matrix.add(row);
        }

        this.nLines = i;
        this.reader.close();
    }


    @Override
    public List<Double> getValueList(int nColumn) throws IOException, ParseException {
        List<Double> column = new ArrayList<>();
        for (int i = 0; i < this.nLines; i++) {
            column.add(matrix.get(i).get(nColumn-1));
        }
        return column;
    }

    private List<Double> getDifferenceList(int n, int m, int order) throws IOException, ParseException {
        List<Double> differences = new ArrayList<>();
        List<Double> firstColumn = getValueList(n);
        List<Double> secondColumn = getValueList(m);
        for (int i = 0; i < this.nLines; i++) {
            differences.add(Math.pow(Math.abs(firstColumn.get(i) - secondColumn.get(i)), order));
        }
        return differences;
    }

    @Override
    public List<Double> getAbsDifferenceList(int n, int m) throws IOException, ParseException {
        return getDifferenceList(n, m, 1);
    }

    @Override
    public List<Double> getQuadraticList(int n, int m) throws IOException, ParseException {
        return getDifferenceList(n, m, 2);
    }

    private List<Integer> getErrorTimeList(int n, int m, int order, double delta) throws IOException, ParseException {
        List<Integer> errorTimeList = new ArrayList<>();
        for (int i = 0; i < this.nLines; i++) {
            if(this.getDifferenceList(n, m, order).get(i) > delta){
                errorTimeList.add(i);
            }
        }

        return errorTimeList;
    }

    @Override
    public List<Integer> getAbsErrorTimeList(int n, int m, double delta) throws IOException, ParseException {
       return getErrorTimeList(n, m, 1, delta);

    }

    @Override
    public List<Integer> getQuadraticErrorTimeList(int n, int m, double delta) throws IOException, ParseException {
        return getErrorTimeList(n, m, 2, delta);
    }

    public void show() {
        // Loop through all rows
        for (int i = 0; i < nLines; i++) {
            System.out.println(matrix.get(i));
        }
    }
}
