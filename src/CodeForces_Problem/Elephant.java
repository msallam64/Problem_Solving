package CodeForces_Problem;

import java.util.Scanner;

public class Elephant {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        int step[] = new int[]{5, 4, 3, 2, 1};
        int coun = 0;
        for (int i = 0; i < step.length; i++) {
            if (x >= step[i]) {
                coun = coun + (x / step[i]);
                x = x % step[i];
            }
        }
        System.out.println(coun);
    }
}
