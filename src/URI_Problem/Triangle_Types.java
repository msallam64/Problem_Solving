package URI_Problem;

import java.util.Scanner;

public class Triangle_Types {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double a, b, c, temp;
        a = in.nextDouble();
        b = in.nextDouble();
        c = in.nextDouble();
        if (a < b) {
            temp = b;
            b = a;
            a = temp;
        }
        if (a < c) {
            temp = c;
            c = a;
            a = temp;
        }

        if (a >= b + c) {
            System.out.println("NAO FORMA TRIANGULO");
        }

        else if ((a * a) == (b * b) + (c * c)) {
            System.out.println("TRIANGULO RETANGULO");
        }
        else if ((a * a) > (b * b) + (c * c)) {
            System.out.println("TRIANGULO OBTUSANGULO");
        }
         if ((a * a) < (b * b) + (c * c)) {
            System.out.println("TRIANGULO ACUTANGULO");
        }
         if (a == b && b == c) {
            System.out.println("TRIANGULO EQUILATERO");
        }
        else if (a == b || a == c || b == c) {
            System.out.println("TRIANGULO ISOSCELES");

        }
    }
}
