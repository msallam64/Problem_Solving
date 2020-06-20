/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CodeForces_Problem;

import java.util.Scanner;

/**
 *
 * @author Mohamed Sallam
 */
public class Ultra_Fast_Mathematician {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
         String no1 = scanner.nextLine();
        String no2 = scanner.next();
        String result = "";
        for (int i = 0; i < no1.length(); i++) {
            if ((Integer.parseInt(no1.charAt(i) + "") == Integer.parseInt(no2.charAt(i) + ""))) {
                result = result + "0";
            } else {
                result = result + "1";
            }
        }
        System.out.println(result);
    
    }
    
}
