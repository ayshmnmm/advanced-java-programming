package MODULE_3;

// toString() method
class A {
    int i;
    A(int i) {
        this.i = i;
    }
    public String toString() {
        return "The value of i is " + i;
    }
}

public class SpecialStringOperations {
    public static void main(String[] args) {
        // toString() method
        A aObj = new A(10);
        System.out.println("printing aObj : "+aObj); 

        // concat() method
        String s1 = "Hello";
        String s2 = "World";
        String s3 = s1.concat(s2);
        // or
        String s4 = s1 + s2;
        System.out.println("s3 : "+s3);
        System.out.println("s4 : "+s4);

        // string literal
        String s5 = "Hello";
        String s6 = new String("Hello");
        String s7 = "Hello";
        String s8 = String.valueOf("Hello");
        System.out.println("s5 == s6 : "+(s5 == s6)); // false
        System.out.println("s5.equals(s6) : "+s5.equals(s6)); // true
        System.out.println("s5 == s7 : "+(s5 == s7)); // true
        System.out.println("s5.equals(s7) : "+s5.equals(s7)); // true
        System.out.println("s5 == s8 : "+(s5 == s8)); // true
        System.out.println("s5.equals(s8) : "+s5.equals(s8)); // true

        // length() method
        System.out.println("s5.length() : "+s5.length());

        // valueOf() method
        int i = 10;
        String s9 = String.valueOf(i);
        System.out.println("s9 : "+s9);
    }
}
