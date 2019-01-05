package CodeForces_Problem;

import java.util.Scanner;

public class HQ9 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String p, out;
        p = in.next();
        out = "NO";
        for (int i = 0; i < p.length(); i++) {
            if (p.charAt(i) == 'H' || p.charAt(i) == 'Q' || p.charAt(i) == '9') {
                out="YES";
                break;
                
            }
        }
        System.out.println(out);
    }
}
