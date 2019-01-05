package CodeForces_Problem;

import java.util.Scanner;

public class Bit {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n, x = 0;
        n = in.nextInt();
        String s;
        for (int i = 0; i < n; i++) {
            s = in.next();
            if (s.charAt(0) == '+' || s.charAt(1) == '+') {
                ++x;
            } else if (s.charAt(0) == '-' || s.charAt(1) == '-') {
                --x;
            } else if (s.charAt(0) == 'x' || s.charAt(1) == '+') {
                x++;
            } else if (s.charAt(0) == 'x' || s.charAt(1) == '-') {
                x--;
            }
        }
        System.out.println(x);

    }

}
