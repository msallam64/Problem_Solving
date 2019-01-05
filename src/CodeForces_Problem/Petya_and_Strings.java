package CodeForces_Problem;

import java.util.Scanner;

public class Petya_and_Strings {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s1 = in.next();
        String s2 = in.next();
        int value = 0;
        s1 = s1.toLowerCase();
        s2 = s2.toLowerCase();
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) == s2.charAt(i)) {
                continue;
            } else if (s1.charAt(i) < s2.charAt(i)) {
                value = -1;
                break;
            } else if (s1.charAt(i) > s2.charAt(i)) {
                value = 1;
                break;
            }

        }
        System.out.println(value);

    }

}
