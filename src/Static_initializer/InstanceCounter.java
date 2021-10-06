package Static_initializer;

/*
* Notice how 'Starting InstaceCounte'
*does not appear as the first
*line of output
*thies is because the class must be loaded before the
*main method can be executed
*which means all static fields and blocks are processed in order
 */
public class InstanceCounter {
    // a static initialization block , executed once when the class is loaded.

    static {
        System.out.println("Class InstanceCounter loading...");
    }

    //a contant like(javascript const)
    static final long ONE_DAY_IN_MILLIS = 24 * 60 * 60 * 1000;

    //a static field
    static int instanceCounter;

    //a second static initialization block
    //static members are processed in the order they appear in the class
    static {
        //we can now access the static fields initialized above
        System.out.println("ONE_DAY_IN_MILLIS = " + ONE_DAY_IN_MILLIS
                + "instanceCounter = " + instanceCounter);
    }

    //an instance initialization block
    //instance blocks are executed each time a class instance is created
    {
        InstanceCounter.instanceCounter++;
        System.out.println("InstanceCounter = " + instanceCounter);
    }

    public static void main(String[] args) {
        System.out.println("Starting  InstanceCounter");
        new InstanceCounter();
        new InstanceCounter();
        new InstanceCounter();
        System.out.println("instanceCounter in main = " + instanceCounter);
    }

    static {
        System.out.println("Class instanceCounter loaded");
    }
}
