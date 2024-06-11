package MODULE_3;

public class ModifyingStrings {
    public static void main(String[] args) {
        String s1 = "The sky is blue";

        // substring()
        System.out.println("s1.substring(4): " + s1.substring(4));
        System.out.println("s1.substring(4, 7): " + s1.substring(4, 7));

        // concat()
        System.out.println("s1.concat(\" and red\").concat(\" and green \"): " + s1.concat(" and red").concat(" and green"));

        // replace()
        System.out.println("s1.replace(\"sky\", \"ocean\"): " + s1.replace("sky", "ocean"));

        // trim() and strip()
        String s2 = "    Hello World  ";
        System.out.println("s2: " + s2);
        System.out.println("s2.trim(): " + s2.trim());
        System.out.println("s2.strip(): " + s2.strip());

        // Data Conversion
        System.out.println("String.valueOf(10): " + String.valueOf(10));
        System.out.println("String.valueOf(10.5): " + String.valueOf(10.5));
        System.out.println("String.valueOf(true): " + String.valueOf(true));
        System.out.println("String.valueOf('a'): " + String.valueOf('a'));
        
        // char[] to String
        char[] ch = {'a', 'b', 'c', 'd'};
        System.out.println("String.valueOf(ch): " + String.valueOf(ch));
        System.out.println("String.valueOf(ch, 1, 2): " + String.valueOf(ch, 1, 2));

        // toLowerCase() and toUpperCase()
        System.out.println("s1: " + s1);
        System.out.println("s1.toLowerCase(): " + s1.toLowerCase());
        System.out.println("s1.toUpperCase(): " + s1.toUpperCase());

        // join()
        String s3 = String.join("-", "Hello", "World", "Java");
        System.out.println("s3: " + s3);

        // repeat()
        System.out.println("s1.repeat(3): " + s1.repeat(3));

    }
}
