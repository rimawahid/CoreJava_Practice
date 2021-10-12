
package learning_array;

import java.util.Scanner;


public class Matrix_Array {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int [][] num1 = new int [2][3];
        int [][] num2 = new int [2][3];
        
        //input for num1 matrix
        System.out.println("Enter elements for num1 matrix : ");
        for (int row = 0; row < 2; row++) {
            for (int col = 0; col < 3; col++) {
                System.out.printf("num1 [%d] [%d] = " ,row,col);
                num1 [row][col] = input.nextInt();
            }
        }
        
        //printing num1 matrix
        System.out.print("num1 : ");
        for (int row = 0; row < 2; row++) {
            for (int col = 0; col < 3; col++) {
                System.out.print("\t " + num1[row][col]);
            }
            System.out.println();
        }
        
        
        //input for num2 matrix
         System.out.println("Enter elements for num2 matrix  : ");
        for (int row = 0; row < 2; row++) {
            for (int col = 0; col < 3; col++) {
                num2 [row][col] = input.nextInt();
            }
        }
        //printing num2 matrix
         System.out.println("num2 : ");
        for (int row = 0; row < 2; row++) {
            for (int col = 0; col < 3; col++) {
                System.out.print("\t " + num2[row][col]);
            }
            System.out.println();
        }
        
        //add num1 and num2 matrix
        System.out.println("sum : ");
        for (int row = 0; row < 2; row++) {
            for (int col = 0; col < 3; col++) {
                System.out.print("\t" + (num1[row][col]+ num2[row][col]));
            }
            System.out.println();
        }
    }
}
