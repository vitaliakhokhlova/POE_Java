package com.formation.start.csv;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.ParseException;
import java.util.List;

public interface IMesureRepository {

    void load(String uri, String separator) throws IOException, ParseException;
    List<Double> getValueList(int column) throws IOException, ParseException;

    List<Double> getAbsDifferenceList(int n, int m) throws IOException, ParseException;
    List<Double> getQuadraticList(int n, int m) throws IOException, ParseException;
    List<Integer> getAbsErrorTimeList(int n, int m, double delta) throws IOException, ParseException;
    List<Integer> getQuadraticErrorTimeList(int n, int m, double delta) throws IOException, ParseException;
}
