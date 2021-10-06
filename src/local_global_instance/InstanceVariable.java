package local_global_instance;

public class InstanceVariable {
    // this instance variable is visible for any child class
    public String name;

    // salary variable is visible in InstanceVariable class only
    private double salary;

    //the name variable is assigned a value
    public InstanceVariable(String empName) {
        name = empName;
    }
    
    //the salary variable id assignes a value
    public void SetSalary  (double empSal){
        salary = empSal;
    }
       
    //this method prints the InstanceVariable details
    public void printEmp(){
        System.out.println("Name : "+name);
        System.out.println("Salary : " + salary);
    }
    public static void main(String[] args) {
        InstanceVariable empOne= new InstanceVariable("Rima");
        empOne.SetSalary(1000);
        empOne.printEmp();
        
    }

}
