package MODULE_3;

public class StringConstructors {
    public static void main(String[] args) {
        // 1. default constructor - empty string
        String s1 = new String();
        System.out.println("s1 : "+s1);

        // 2. constructor with char array
        char[] ch = {'a', 'b', 'c', 'd'};
        String s2 = new String(ch);
        System.out.println("s2 : "+s2);

        // 3. constructor with char array, start index and length
        String s3 = new String(ch, 1, 2);
        System.out.println("s3 : "+s3);
        
        // 4. using StringBuffer
        
        // 5. using StringBuilder

    }
}
