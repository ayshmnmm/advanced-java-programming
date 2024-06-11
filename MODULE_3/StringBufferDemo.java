package MODULE_3;

public class StringBufferDemo {
    public static void main(String[] args) {
        // StringBuffer used to create mutable strings

        // constructors
        // empty constructor
        StringBuffer sb1 = new StringBuffer();
        System.out.println("sb1: " + sb1);
        System.out.println("sb1.length(): " + sb1.length());
        System.out.println("sb1.capacity(): " + sb1.capacity());

        // StringBuffer(int capacity)
        StringBuffer sb2 = new StringBuffer(10);
        System.out.println("sb2: " + sb2);
        System.out.println("sb2.length(): " + sb2.length());
        System.out.println("sb2.capacity(): " + sb2.capacity());

        // StringBuffer(String str)
        String s = "Hello World";
        StringBuffer sb3 = new StringBuffer(s);
        System.out.println("sb3: " + sb3);
        System.out.println("sb3.length(): " + sb3.length());
        System.out.println("sb3.capacity(): " + sb3.capacity());

        // StringBuffer(CharSequence seq)
        CharSequence cs = "Hello World";
        StringBuffer sb4 = new StringBuffer(cs);
        System.out.println("sb4: " + sb4);
        System.out.println("sb4.length(): " + sb4.length());
        System.out.println("sb4.capacity(): " + sb4.capacity());

    }
}
