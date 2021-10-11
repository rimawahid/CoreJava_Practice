/* String is used to manipulate character string that
* cannot be change (read-only and immutable).
* String Buffer is used to represent characters that can be modified.
*performance wise , String Buffer is faster when performing concatenations.
* you are creating a new object (internally)
* every time since String is immutable.
 */
package stirng_vs_stringBuffer;

public class StringVsBuffer {

    //String
    public static String concatWithString() {
        String s1 = "Hello";
        for (int i = 0; i < 10000; i++) {
            s1 = s1.concat(" World");
        }
        return s1;

    }

    //String Buffer
    public static String concatWithStringBuffer() {
        StringBuffer sb = new StringBuffer("Hello");
        for (int i = 0; i < 10000; i++) {
            sb.append(" world");
        }
        return sb.toString();
    }
    
    //String Builder
    public static String concatWithStringBuilder() {
        StringBuilder sb = new StringBuilder("Hello");
        for (int i = 0; i < 10000; i++) {
            sb.append(" world");
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        concatWithString();
        System.out.println("Concat with String took :" +
                (System.currentTimeMillis() - start) + "ms");
        start = System.currentTimeMillis();
        concatWithStringBuffer();
        System.out.println("Concat with String Buffer took :" + 
                (System.currentTimeMillis() - start) + "ms");
        start = System.currentTimeMillis();
        concatWithStringBuilder();
        System.out.println("Concat with String Builder took :" + 
                (System.currentTimeMillis() - start) + "ms");
    }
}
