package general;

import java.util.Scanner;

public class TP_2018_06_22_MathExpression {

    public static void main(String[] args) {

        System.out.println("Entrez une expression math�matique:");
        Scanner scanner = new Scanner(System.in);
        String expression = scanner.nextLine();

        System.out.println(expression + " = " + calcul(expression));
    }

    public static double calcul(String expression) {
        double calcul = 0;
        String[] parts;
        String[] operators = new String[]{"+", "-", "*", "/"};
        boolean contains = false;
        for (String c : operators)
            if (expression.contains(c)) {
                contains = true;
                break;
            }
        if (contains) {
            for (String c : operators) {
                if (expression.contains(c)) {
                    parts = expression.split("\\" + c, 2);

                    switch (c) {
                        case "+": {
                            calcul = calcul(parts[0]) + calcul(parts[1]);
                            break;
                        }

                        case "-": {
                            calcul = calcul(parts[0]) - calcul(parts[1]);
                            break;
                        }


                        case "*": {
                            calcul = calcul(parts[0]) * calcul(parts[1]);
                            break;
                        }

                        case "/": {
                            calcul = calcul(parts[0]) / calcul(parts[1]);
                        }
                    }
                    return calcul;
                }
            }
            return -1. / 0.;
        } else {
            calcul = Integer.parseInt(expression);
            return calcul;
        }
    }
}
