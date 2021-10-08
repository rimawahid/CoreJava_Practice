package learning_array;

import java.util.Scanner;

public class findingSumAndAvg {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[] num = new double[5];
        double sum = 0;
        System.out.print("Please Enter 5 number ");
//        num[0] = input.nextDouble();
//        num[1] = input.nextDouble();
//        num[2] = input.nextDouble();
//        num[3] = input.nextDouble();
//        num[4] = input.nextDouble();
//        sum = num[0] + num[1] + num[2] + num[3] + num[4];

        //using loop
        for (int i = 0; i < 5; i++) {
            num[i] = input.nextDouble();
        }
        int len = num.length;
        for (int i = 0; i < len; i++) {
            sum = sum + num[i];
        }
        double avg = sum / len;
        System.out.println("The sum is : " + sum);
        System.out.println("The Avg is : " + avg);

        //max
        double max = num[0];
        for (int i = 1; i < 5; i++) {
            if (max < num[i]) {
                max = num[i];
            }

        }
        System.out.println("Max num is : " + max);

        //min
        double min = num[0];
        for (int i = 1; i < len; i++) {
            if (min > num[i]) {
                min = num[i];
            }
        }

    }
}
