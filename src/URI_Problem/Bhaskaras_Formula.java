package URI_Problem;

import java.util.Scanner;
import java.text.DecimalFormat;
import java.math.*;

public class Bhaskaras_Formula {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00000");
        double a = in.nextDouble();
        double b = in.nextDouble();
        double c = in.nextDouble();
        double delta = (Math.pow(b, 2)) - ((4 * a) * c);
        double deltaRaiz = Math.sqrt(delta);
        double div = (2 * a);
        double x1 = (-b + deltaRaiz) / div;
        double x2 = (-b - deltaRaiz) / div;
        String a1, a2;
        a1 = df.format(x1);
        a2 = df.format(x2);
        if (deltaRaiz > 0 && a != 0) {
            System.out.println("R1 = " + a1);
            System.out.println("R2 = " + a2);
        } else {
            System.out.println("Impossivel calcular");

        }

    }
}
