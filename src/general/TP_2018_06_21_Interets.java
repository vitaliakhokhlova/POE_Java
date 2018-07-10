package general;

public class TP_2018_06_21_Interets {

    public static void main(String[] args) {
        double s1 = 100;
        double s2 = 200;
        double interets = 0.05;

        int n;
        n = (int) Math.ceil(Math.log(s2 / s1) / Math.log(1 + interets));


        double s = s1;
        int annee = 0;
        while (s < s2) {
            s *= 1 + interets;
            annee++;
        }
        System.out.println("La somme souhait�e va �tre atteinte:");
        System.out.println("La solution exacte : " + n + " annees");
        System.out.println("La solution avec une boucle 'while' : " + annee + " annees");

    }

}
