package general;

import java.util.Locale;
import java.util.Scanner;

public class TP_2018_06_19_Println {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);// pour lire un variable sur le clavier
        sc.useLocale(Locale.UK); // pour entrer "2.5" au lieu de "2,5"
        System.out.println("Entrez un entier x");
        int x = sc.nextInt(); //lire un entier sur le clavier

        System.out.println("Entrez un entier y");
        int y = sc.nextInt();

// print avec un saut de ligne
        System.out.println(x + " + " + y + " = " + (x + y));
        System.out.println(x + " - " + y + " = " + (x - y));
        System.out.println(x + " / " + y + " = " + ((float) x / (float) y));
        System.out.println("Le reste de " + x + "/" + y + " = " + x % y);

        // print format�
        System.out.printf(x + " + " + y + " = %d\n" +
                        "x - y = %d\n" +
                        "x/y=%.2f\n" +
                        "x-(x/y)*y=%d",
                x + y,
                x - y,
                (float) x / y,
                x % y);


        System.out.println("Entrez un double");
        double d = sc.nextDouble();//lire un double sur le clavier
        System.out.println("d=" + d);

        System.out.println("Entrez un string");
        sc.nextLine(); //pour lire un string il faut netoyer le m�moire
        String s = sc.nextLine(); //lire un string sur le clavier
        System.out.println("s=" + s);


        sc.close(); //fermer l'entr�e
    }

}
