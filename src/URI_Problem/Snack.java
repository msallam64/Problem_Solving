package URI_Problem;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Snack {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");
        int x = in.nextInt();
        int y = in.nextInt();
        if (x == 1) {
            System.out.println("Total: R$ " + df.format(4 * y));
        } else if (x == 2) {
            System.out.println("Total: R$ " + df.format(4.5 * y));
        } else if (x == 3) {
            System.out.println("Total: R$ " + df.format(5 * y));
        } else if (x == 4) {
            System.out.println("Total: R$ " + df.format(2 * y));
        } else if (x == 5) {
            System.out.println("Total: R$ " + df.format(1.5 * y));
            
        }
        
    }
    
}
