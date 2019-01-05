package CodeForces_Problem;

import java.util.Scanner;

public class Way_Too_Long_Words {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String w;
        for (int i = 0; i < n; i++) {
            w = in.next();
            if (w.length() > 10) {                
                int c = w.length() - 2;
                System.out.print(w.charAt(0));
                System.out.print(c);
                System.out.println(w.charAt(w.length() - 1));
            } else {
                System.out.println(w);
            }
            
        }
        
    }
}
