package URI_Problem;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Triangle {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.0");
        String s;
        double a, b, c;
        a = in.nextDouble();
        b = in.nextDouble();
        c = in.nextDouble();
        if (a + b > c && a + c > b && c + b > a) {
            s = df.format(a + b + c);

            System.out.println("Perimetro = " + s);
        } else {
            s = df.format(c * (a + b) / 2);
            System.out.println("Area = " + s);
        }

    }

}
