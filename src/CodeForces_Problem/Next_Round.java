package CodeForces_Problem;

import java.util.Scanner;

public class Next_Round {

    public static void main(String[] args) {

        int[] scores = new int[50];
        int n, k, counter = 0;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        k = sc.nextInt();
        k = k - 1; // array starting with 0

        for (int iterator = 0; iterator < n; iterator++) {
            scores[iterator] = sc.nextInt();
        }
        if (scores[k] > 0) {
            for (int iterator = k + 1; iterator < n && scores[k] == scores[iterator]; iterator++) {
                counter++;
            }
            System.out.println(counter + k + 1);
        } else {
            for (int iterator = 0; iterator < k && scores[iterator] > 0; iterator++) {
                counter++;
            }
            System.out.println(counter);
        }

    }
}
