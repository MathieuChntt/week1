import java.util.Scanner;

public class Class02 {
    public static void q1(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = scanner.nextInt();
        double pi = 0;
        for(int k = 0; k < n; k++){
            pi += ( Math.pow(-(0.33333333),k)/(2*k + 1));
        }
        pi *= Math.sqrt(12);
        System.out.printf("%.8f\n",pi);
        System.out.printf("%.4f",pi);
        // There is a rounding process
    }

    public static void q2(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number:");
        float r = scanner.nextFloat();
        System.out.printf("Perimeter: %.4f\n",2*r*Math.PI);
        System.out.printf("Area: %.4f", r*r*Math.PI);
    }

    public static void q3(){
        int pop = 312032486;
        for(int y = 0; y < 5; y++){
            for(int s = 0; s < (365*24*60*60); s++){
                if(s%7 == 0) pop++;
                if(s%13 == 0) pop--;
                if(s%45 == 0) pop++;
            }
            System.out.printf("Year : %d-> Population : %d\n",y,pop);
        }

    }
}
