package learning_array;

public class MultidimentionArray {

    public static void main(String[] args) {

        int[][] arr = new int[3][2];
        arr[0][0] = 3;
        arr[0][1] = 4;

        arr[1][0] = 6;
        arr[1][1] = 7;

        arr[2][0] = 9;
        arr[2][1] = 10;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(" " + arr[i][j]);
            }
            System.out.println("");
        }
        //declaring and initializing 2D array
        int[][] num = new int[3][];
        num[0] = new int[3];
        num[1] = new int[2];
        num[2] = new int[3];
        int num1[][] = {{2, 4, 6}, {8, 9}, {3, 5, 7}};
        //printing 2D array

        for (int i = 0; i < num1.length; i++) {
            for (int j = 0; j < num1[i].length; j++) {
                System.out.print(num1[i][j] + " ");
            }
            System.out.println("");
        }
    }
}
