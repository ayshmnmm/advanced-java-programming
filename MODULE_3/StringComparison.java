package MODULE_3;

public class StringComparison {
    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = new String(s1);
        String s3 = "HELLO";
        String s4 = "Hello";

        // equals()
        System.out.println("s1.equals(s2): " + s1.equals(s2));

        // equalsIgnoreCase()
        System.out.println("s1.equalsIgnoreCase(s3): " + s1.equalsIgnoreCase(s3));

        // regionMatches()
        System.out.println("s1.regionMatches(0, s4, 0, 5): " + s1.regionMatches(0, s3, 0, 1));

        // startsWith()
        System.out.println("s1.startsWith(\"He\"): " + s1.startsWith("He"));

        // endsWith()
        System.out.println("s1.endsWith(\"lo\"): " + s1.endsWith("lo"));

        // startsWith(String str, int startIndex)
        System.out.println("s1.startsWith(\"llo\",2): " + s1.startsWith("llo", 2));

        // compareTo()
        System.out.println("s1.compareTo(s3): " + s1.compareTo(s3));

        // compareToIgnoreCase()
        System.out.println("s1.compareToIgnoreCase(s3): " + s1.compareToIgnoreCase(s3));

        // == vs equals()
        System.out.println("s1 == s2: " + (s1 == s2));
        System.out.println("s1 == s4: " + (s1 == s4));
        System.out.println("s1.equals(s2): " + s1.equals(s2));
        System.out.println("s1.equals(s4): " + s1.equals(s4));

        
    }
}
