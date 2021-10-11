package field_variable;

import java.util.Date;

public class ConstructorConcept {

    double d;
    Date date = new Date();
    String s;
    //non-argument constructor

    public ConstructorConcept() {
    }
    // argument constructor

    public ConstructorConcept(String s) {
        this.s = s;
    }
    
    //non-argument method
    int sum(){
        return 0;
    }
    
    //argument method
    int sum(int d){
        return d;
    }

    public static void main(String[] args) {
        ConstructorConcept cc = new ConstructorConcept("Hello");
        System.out.println(cc.s);
        System.out.println(cc.d);
        System.out.println(cc.sum(10));
         System.out.println(cc.sum());

    }
}
