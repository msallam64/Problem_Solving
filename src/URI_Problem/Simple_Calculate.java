package URI_Problem;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Simple_Calculate {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");
        int Code_of_Produdt1 = input.nextInt();
        int Number_of_Produdt1 = input.nextInt();
        double price_of_one_from_product1 = input.nextDouble();
        double Total_of_product1 = Number_of_Produdt1 * price_of_one_from_product1;
        int Code_of_Produdt2 = input.nextInt();
        int Number_of_Produdt2 = input.nextInt();
        double price_of_one_from_product2 = input.nextDouble();
        double Total_of_product2 = Number_of_Produdt2 * price_of_one_from_product2;
        double Total = Total_of_product1 + Total_of_product2;
        String a = df.format(Total);
        System.out.println("VALOR A PAGAR: R$ " + a);
    }

}
