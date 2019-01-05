package URI_Problem;

import java.util.Scanner;

public class Coordinates_of_aPoint {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double x, y;
        x = in.nextDouble();
        y = in.nextDouble();
        if (x > 0 && y > 0) {
            System.out.println("Q1");
        } else if (x < 0 && y > 0) {
            System.out.println("Q2");
        } else if (x < 0 && y < 0) {
            System.out.println("Q3");
        } else if (x > 0 && y < 0) {
            System.out.println("Q4");
        } else if (x == y && y == 0) {
            System.out.println("Origem");
        } else if (x == 0) {
            System.out.println("Eixo X");
        } else if (y == 0) {
            System.out.println("Eixo Y");
        }

    }
}
