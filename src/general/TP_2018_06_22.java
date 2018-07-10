package general;

import java.util.Arrays;

public class TP_2018_06_22 {

    public static void main(String[] args) {

        int[] tab1 = new int[]{1, 2, 3, 4, 5};
        System.out.println("La somme de " + Arrays.toString(tab1) + "=" + sum(tab1));

        double[] tab2 = new double[]{-9.5, 1, -98.21, 218.2};
        System.out.println("Le minimum de " + Arrays.toString(tab2) + "=" + min(tab2));

        int[] tab3 = new int[]{1, 2, 3, 4};
        int[] tab4 = new int[]{5, 6};
        int[] tab5 = merge(tab3, tab4);
        System.out.println(Arrays.toString(tab5));

        double[][] matrice = new double[][]{{}, {1, 2}, {3}, {4, 5, 6, 7}, {}};
        double maximum = max(matrice);
        System.out.println("Le maximum de la matrice");
        System.out.println(Arrays.deepToString(matrice));
        System.out.println("est " + maximum);

        System.out.println(roman(983));

    }

    public static int sum(int[] tab) {
        int somme = 0;
        for (int t : tab)
            somme += t;
        return somme;
    }

    public static double min(double[] tab) {
        double minimum = 0;
        for (double t : tab)
            if (t < minimum)
                minimum = t;
        return minimum;
    }

    public static int[] merge(int[] tab1, int[] tab2) {

        int[] tab3 = new int[tab1.length + tab2.length];
		
		/* Ma solution
		tab3[0] = tab1[0];
		int minimum = Math.min(tab1.length, tab2.length);
		for (int i = 1; i < 2 * minimum; i++) {
			if (i % 2 == 1)
				tab3[i] = tab2[i / 2];
			else
				tab3[i] = tab1[i / 2];
		}
		for (int i = 2 * minimum; i < tab1.length + tab2.length; i++) {
			if (tab1.length > minimum)
				tab3[i] = tab1[i - minimum];
			else
				tab3[i] = tab2[i - minimum];
		}
		*/

        //solution du prof
        int indiceTab3 = 0;
        int indiceTab1EtTab2 = 0;
        while (indiceTab3 < tab3.length) {
            if (indiceTab1EtTab2 < tab1.length) {
                tab3[indiceTab3] = tab1[indiceTab1EtTab2];
                indiceTab3++;
            }
            if (indiceTab1EtTab2 < tab2.length) {
                tab3[indiceTab3] = tab2[indiceTab1EtTab2];
                indiceTab3++;
            }
            indiceTab1EtTab2++;
        }

        return tab3;

    }

    public static double max(double[][] matrice) {
        double maximum = -1.0 / 0.0;
        for (double[] row : matrice) {
            for (double r : row)
                if (r > maximum)
                    maximum = r;
        }
        return maximum;
    }

    public static String roman(int arabic) {
        String roman = "";
        int digit = 0;
        char[] units = new char[]{'I', 'X', 'C', 'M'};
        char[] fives = new char[]{'V', 'L', 'D'};
        for (int i = 3; i >= 0; i--) {
            digit = arabic / (int) Math.pow(10, i);

            if (digit % 5 == 4) roman += units[i];
            if (digit == 9) roman += units[i + 1];
            else if (digit >= 4) roman += fives[i];
            for (int j = 0; j < (digit % 5) % 4; j++) roman += units[i];

            arabic %= Math.pow(10, i);
        }

        return roman;
    }
}

