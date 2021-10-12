
package learning_array;


public class For_Each_Loop {
    public static void main(String[] args) {
        String [] name = new String[4];
        name[0] = "Rima";
        name[1] = "Ruba";
        name[2] = "Raisa";
        name[3] = "Rhanuma";
        for(String x : name){
            System.out.println(x);
        }
        
        int [] num ={23,45,567,78,75,67};
        int sum = 0;
        for(int s: num){
            sum = sum+s;
        }
        System.out.println("Sum : " + sum);
        
    }
}
