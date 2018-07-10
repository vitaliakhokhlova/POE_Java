package general;

import java.util.Arrays;

public class TP_2018_06_20_Dessins {
    static String p = "";
    static String s = "";

    public static void main(String[] args) {

        /*
         * int i; //si on veut r�cup�rer la valeur de i apr�s la boucle for(i=0; i<10;
         * ++i) { if(i==2) continue; System.out.println(i); if (i>6) break; }
         * System.out.println(i);
         */

        System.out.println("La longueur:");
        System.out.println("La largeur:");
        //Scanner scanner = new Scanner(System.in);

        // int n=scanner.nextInt();
        // int m=scanner.nextInt();
        int n = 8;
        int m = 2;
        System.out.println("Ligne");
        for (int i = 0; i < n; i++) System.out.print("*");

        System.out.println();
        System.out.println("Carre");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) System.out.print("* ");
            System.out.println();
        }

        System.out.println();
        System.out.println("Triangle");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i + 1; j++) System.out.print("*");
            System.out.println();
        }

        System.out.println();
        System.out.println("Rectangle");

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) System.out.print("*");
            System.out.println();
        }
        System.out.println();
        System.out.println("Triangle equilateral");

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) System.out.print(" ");
            for (int j = -i; j < i + 1; j++) System.out.print("*");
            System.out.println();
        }

        // deuxi�me solution
        System.out.println("Matrice:");

        String[][] matrice = new String[n][2 * n];
        for (String[] row : matrice) Arrays.fill(row, " ");
        for (int i = 0; i < n; i++) {
            for (int j = -i; j < i + 1; j++) matrice[i][j + n - 1] = "*";

        }
        for (String[] row : matrice) System.out.println(Arrays.toString(row));


        System.out.println();
        System.out.println("Losange");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i + 1; j++) System.out.print(" ");
            for (int j = -i; j < i + 1; j++) System.out.print("*");
            System.out.println();
        }
        for (int i = n; i >= 0; i--) {
            for (int j = 0; j < n - i + 1; j++) System.out.print(" ");
            for (int j = -i; j < i + 1; j++) System.out.print("*");
            System.out.println();
        }

        System.out.println();
        System.out.println("Sapin");
        for (int k = 0; k < 3; k++) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n - i + 1; j++) System.out.print(" ");
                for (int j = -i; j < i + 1; j++) System.out.print("*");
                System.out.println();
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) System.out.print(" ");
            for (int j = 0; j < 3; j++) System.out.print("*");
            System.out.println();
        }

        System.out.println();
        System.out.println("Carre vide");
        for (int i = 0; i < n; i++) {
            if (i == 0 || i == n - 1) {
                for (int j = 0; j < n; j++) System.out.print("* ");
            } else {
                System.out.print("*");
                for (int j = 0; j < n - 2; j++) System.out.print("  ");
                System.out.print(" *");
            }
            System.out.println();
        }

        System.out.println("Recursivit�");
        triangleRecursive(5);
    }

    static void triangleRecursive(int n) {

        if (n == 0) {
            return;
        } else {
            p = premiereLigne(n);
            System.out.println(p);
            triangleRecursive(n - 1);
        }
    }

    static String premiereLigne(int n) {
        if (n == 0) {
            return "*";
        } else {
            s = s + " ";
            premiereLigne(n - 1);
            return s;
        }
    }

}
