package A2;

import java.util.Scanner;

public class Omar {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] X = new int[n];
        int[] Y = new int[n];
        for (int i = 0; i < n; i++) {
            X[i] = in.nextInt();
            Y[i] = in.nextInt();
        }
        for (int i = 0; i < n; i++) {

            System.out.println(X[i] + Y[i]);

        }
    }
}
