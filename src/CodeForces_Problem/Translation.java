package CodeForces_Problem;

import java.util.Scanner;

public class Translation {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s, t;
        s = in.next();
        t = in.next();
        if (s.length() == t.length()) {
            if (solve(s, t)) {
                System.out.println("YES");

            } else {
                System.out.println("NO");
            }
        }
        else System.out.println("NO");
    }

    public static boolean solve(String s, String t) {
        int len = s.length();
        for (int i = 0; i < len; i++) {
            if (s.charAt(i) != t.charAt(len - 1 - i)) {
                return false;
            }

        }
        return true;
    }

}
