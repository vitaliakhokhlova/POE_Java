package com.formation.start.genetic;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ImportFile {

        private int nLines;
        private int nColumns;
        private List<ArrayList<String>> matrix = new ArrayList();

    public String[][] getData() {
        String[][] array2D= new String[nLines][nColumns];
        int i =0;
        for(ArrayList<String> row : matrix){
            int j = 0;
            for(String r : row){
                array2D[i][j++] = r;
            }
            i++;
        }
        return array2D;
    }

        public ImportFile(String uri, String separator) throws IOException {
            BufferedReader reader = new BufferedReader(new FileReader(uri));
            String line;
            int i = 0;
            while ((line = reader.readLine()) != null) {
                String[] rowString = line.split(separator);
                this.nColumns = rowString.length;
                ArrayList<String> singleList = new ArrayList<>();
                for(String r : rowString) {singleList.add(r);}
                matrix.add(singleList);
                i++;
            }

            this.nLines = i;
            reader.close();
        }

        public void print(){
            for(ArrayList<String> s : matrix) {
                System.out.println(s);
            }}



        public int getnLines() {
            return nLines;
        }

        public int getnColumns() {
            return nColumns;
        }
    }


