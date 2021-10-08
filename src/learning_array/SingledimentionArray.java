
package learning_array;

import java.util.Arrays;


public class SingledimentionArray {
    public static void main(String[] args) {
        // declaration and instantiation
//        int [] arr = new int[5];
//        arr[0] = 10;
//        arr[1] = 11;
//        arr[2] = 12;
//        arr[3] = 13;
//        arr[4] = 14;
        
        
        int [] num = {21,250,5,14,27};
        int len = num.length;
        
        System.out.print("Given number : ");
        for(int i=0; i<len; i++){
            System.out.print(" " + num[i]);
        }
        System.out.println("\n");
        System.out.print("Accending order number : ");
        Arrays.sort(num);
        for(int i=0; i<len; i++){
            System.out.print(" " + num[i]);
        }
    }
}
