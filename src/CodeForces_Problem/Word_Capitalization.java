package CodeForces_Problem;

import java.util.Scanner;

public class Word_Capitalization {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        if (s.charAt(0) >= 'a' && s.charAt(0) <= 'z') {
            s = (char) (s.charAt(0) - 32) + s.substring(1);
            
        }
        System.out.println(s);

    }
}
