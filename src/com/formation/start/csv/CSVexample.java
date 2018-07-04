package com.formation.start.csv;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

public class CSVexample {

    public static void main(String[] args) {
         ImportTable table = new ImportTable();
        table.load(path+"Mesures.csv", ";");
        table.print();

        BookRepository bookRepository = new BookRepository();
        bookRepository.load(path + "Livres.csv", ";");
        bookRepository.fill();
        System.out.println(bookRepository);
        bookRepository.remove(bookRepository.getById(1));
        System.out.println(bookRepository);

        Mesures mesures = new Mesures();
        mesures.load(path + "Mesures.csv", ";");
        System.out.println(mesures.getDifference(2,3,2));
        System.out.println(mesures.getIndexDifference(2,3,2, 0.001));
    }
        
}
