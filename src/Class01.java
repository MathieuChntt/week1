import java.util.Scanner;

public class Class01 {
    public static void q1(){
        System.out.println((9.5*4.5-2.5*3)/(45.5-3.5));
    }

    public static void  q2(){
        double answer = (9.5*4.5-2.5*3)/(45.5-3.5);
        System.out.printf("%2.2f",answer);
    }

    public static void q3(){
        Scanner scanner = new Scanner(System.in);
        double[] values = new double[7];
        for(int i=0; i < 6; i++){
            System.out.println("Enter a number : ");
            values[i] = scanner.nextDouble();
        }
        double answer = (values[0]*values[1]-values[2]*values[3])/(values[4]-values[5]);
        System.out.println("The result without formatting output : "+ answer );
        System.out.printf("The result with two digits after the floating point : %.2f\n",answer);
        System.out.printf("The result with four digits after the floating point : %.4f\n",answer);


    }
}
