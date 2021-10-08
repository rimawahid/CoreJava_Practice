
package learning_array;


public class MultidimentionArray {
    public static void main(String[] args) {
      int [][] arr = new int[3][2];
      arr[0][0] = 3;
       arr[0][1] = 4;
       //arr[0][2] = 5;
       arr[1][0] = 6;
       arr[1][1] = 7;
       // arr[1][2] = 8;
        arr[2][0] = 9;
        arr[2][1] = 10;
       // arr[2][2] = 11;
        
        for(int i = 0; i< 3; i++){
            for(int j = 0; j<2;j++){
                System.out.print(" " + arr [i][j]);
            }
             System.out.println("");
        }
       
        
        
    }
}
