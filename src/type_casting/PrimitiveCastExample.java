
package type_casting;


public class PrimitiveCastExample {
    public static void main(String[] args) {
        //String to int
        String s = "123";
        int st_i= Integer.parseInt(s);
        //or
         st_i = Integer.valueOf(s).intValue();
        System.out.println("String to int : " + st_i);
        
        //int to String
        int i = 123;
        String in_s = Integer.toString(i);
        System.out.println("Int to string : " + in_s);
        
        //String to double
        String sd = "13";
        double sTod= Double.parseDouble(sd);
        System.out.println("String to double : "+ sTod);
        
        //Double to String
        double ds = 13.5;
        String dTos = Double.toString(ds);
        System.out.println("Double to String : " + dTos);
        
        //String to long
        String sl = "12345";
        long sTol = Long.valueOf(sl).longValue();
        System.out.println("String to long : " + sTol);
        
        //long to string
        //String lTos = Long.toString()
        
        
        //char to int
        char c = 'a';
        int cToi = c; // no need to explicit cast
        System.out.println("char to int : " + cToi);
        
        //int to char
        int ii = 23;
        char iToc = (char)ii;
        System.out.println("int ot char : "+ iToc);
        //another way
        System.out.println(Character.toChars(23));
        
        //String to char
        String ss= "Hello";
        //char sToc = (char)ss.charAt(0);
        char sToc = ' ';
        for (int j = 0; j < ss.length(); j++) {
            sToc = (char)ss.charAt(j);
            System.out.print(" "+sToc);
        }
        System.out.println(" ");
        //System.out.println("String to char : "+ sToc);
        
        
        //int to double , widening
        int iii = 5;
        double iTod = iii;
        System.out.println("int to double : " +  iTod);
        
        //double to int
        double dd = 23.45;
        int dToi = (int)dd;
        System.out.println("double to int : " + dToi);
    }
}
