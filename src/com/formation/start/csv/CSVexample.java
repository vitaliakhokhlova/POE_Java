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
        try {
            /*BufferedReader reader = new BufferedReader(new FileReader("Mesures.csv"));
            String line = reader.readLine();
            while(line != null){
                System.out.println(line);
                line = reader.readLine();
            }
            reader.close();

            String s = "5;3;3";
            StringTokenizer st = new StringTokenizer(s,";");
            System.out.println(st.nextToken());
            System.out.println(st.nextToken());
            System.out.println(st.nextToken());
            s = "3";
            double d = Double.parseDouble(s);
            System.out.println(d);*/
            Mesure mesure = new Mesure();
            mesure.load("Mesures.csv", ";");
            List<ArrayList<Double>>  matrix = mesure.getMatrix();
            mesure.show();
            System.out.println(mesure.getQuadraticList(2,3));
            System.out.println(mesure.getQuadraticErrorTimeList(2,3, 0.13));
        }
        catch (FileNotFoundException e){
            e.printStackTrace();
        }
        catch (IOException ex){
            ex.printStackTrace();
        }

        catch (ParseException e){
            e.printStackTrace();
        }

    }
}
