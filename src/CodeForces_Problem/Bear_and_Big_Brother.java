package CodeForces_Problem;

import java.util.Scanner;

public class Bear_and_Big_Brother {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a, b, y = 0;
        a = in.nextInt();
        b = in.nextInt();
        while (a <= b) {
            a = a * 3;
            b = b * 2;
            y++;
        }
        System.out.println(y);

    }

}
