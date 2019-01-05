package URI_Problem;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Area {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.000");
        double A = input.nextDouble();
        double B = input.nextDouble();
        double C = input.nextDouble();
        double Area_of_TRIANGULO = .5 * A * C;
        double Area_of_CIRCULO = 3.14159 * C * C;
        double Area_of_TRAPEZIO = .5 * (A + B) * C;
        double Area_of_QUADRADO = B * B;
        double Area_of_RETANGULO = A * B;
        String a1, a2, a3, a4, a5;
        a1 = df.format(Area_of_TRIANGULO);
        a2 = df.format(Area_of_CIRCULO);
        a3 = df.format(Area_of_TRAPEZIO);
        a4 = df.format(Area_of_QUADRADO);
        a5 = df.format(Area_of_RETANGULO);
        System.out.println("TRIANGULO: " + a1);
        System.out.println("CIRCULO: " + a2);
        System.out.println("TRAPEZIO: " + a3);
        System.out.println("QUADRADO: " + a4);
        System.out.println("RETANGULO: " + a5);

    }
}
