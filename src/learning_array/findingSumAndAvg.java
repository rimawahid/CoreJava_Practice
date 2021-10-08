package learning_array;

import java.util.Scanner;

public class findingSumAndAvg {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[] num = new double[5];
        double sum = 0;
        System.out.print("Please Enter 5 number");
//        num[0] = input.nextDouble();
//        num[1] = input.nextDouble();
//        num[2] = input.nextDouble();
//        num[3] = input.nextDouble();
//        num[4] = input.nextDouble();
//sum = num[0] + num[1] + num[2] + num[3] + num[4];

        //using loop
        for (int i = 0; i < 5; i++) {
            num[i] = input.nextDouble();
        }
        int len = num.length;
        for(int i = 0; i<len; i++){
            sum = sum+num[i];
        }

        System.out.print("The sum is : " + sum);
        System.out.println("The Avg is : " + sum/len);
    }
}
