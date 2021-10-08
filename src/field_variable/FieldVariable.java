
package field_variable;

import java.util.Date;


public class FieldVariable {
    //Field variable declaration
        
        //Initializatin by default value
        double d;
        
        //Initialization using explicit value
        Date date = new Date();
        
        //Initialization using constructor
        String s;
        
        public FieldVariable(String s) {
        this.s = s;
    }
        
    public static void main(String[] args) {
        FieldVariable fv = new FieldVariable("Hello");
        System.out.println(fv.d);
        System.out.println(fv.date);
         System.out.println(fv.s);
    }

    
}
