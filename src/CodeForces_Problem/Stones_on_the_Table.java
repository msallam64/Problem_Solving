package CodeForces_Problem;

import java.util.Scanner;

public class Stones_on_the_Table {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int count = 0;
        int n = in.nextInt();
        String s = in.next();
        for (int i = 1; i < n; i++) {
            if (s.charAt(i) == s.charAt(i - 1)) {
                count++;
                
            }
        }
        System.out.println(count);
    }
}
