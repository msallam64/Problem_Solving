package URI_Problem;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Difference {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int A, B, C, D;
        A = input.nextInt();
        B = input.nextInt();
        C = input.nextInt();
        D = input.nextInt();
        int Defferance=(A*B)-(C*D);
        System.out.println("DIFERENCA = "+Defferance);
    }
}
