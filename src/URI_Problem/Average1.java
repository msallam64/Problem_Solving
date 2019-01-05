package URI_Problem;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Average1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00000");
        double x1,x2,x3,x4,MEDIA;
        x1=input.nextDouble();
        x2=input.nextDouble();
        x3=x1*3.5;
        x4=x2*7.5;
        MEDIA=(x3+x4)/11;
        String a=df.format(MEDIA);
        System.out.println("MEDIA = "+a);
        
    }
}
