
package field_variable;


public class ThisRefEx {
    //instance variable
    int x;
    String y;
    
    public ThisRefEx(int xx, String y){
       this.x = x;
        this.y = y;
    }
    
    void doYYY(String[] args){
        RecRef ref = new RecRef();
        //passing current object as a parameter
        ref.doXX(this);
        ref.doMM(x);
    }
    void sum(int x, int y){
        System.out.println(x+y);
    }
    
    class RecRef {
        void doXX (ThisRefEx rr){
            rr.sum(6, 7);
        }
        void doMM(int s){
            
        }
    }
}
