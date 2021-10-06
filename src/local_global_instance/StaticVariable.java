package local_global_instance;

public class StaticVariable {
//salary variable is a private static

    private static double salary;
    int x;//instance/non-static variable
    //DEPARTMENT is a constant
    public static final String DEPARTMENT = "Development";

    void test() {
        x = 0;
        salary = 500; //non-static member can access static member
      
    }

    public static void main(String[] args) {
        //x = 0;  //static member can not access non-static member
        StaticVariable sv = new StaticVariable();
        sv.x = 100;
        salary = 1000;
        System.out.println(DEPARTMENT + " average salary : " + salary);
    }
}
