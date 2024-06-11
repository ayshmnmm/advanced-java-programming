package MODULE_3;

public class SearchingStrings {
    public static void main(String[] args) {
        String s1 = "Hello World";

        // indexOf()
        System.out.println("s1.indexOf('o'): " + s1.indexOf('o'));
        System.out.println("s1.indexOf('o', 5): " + s1.indexOf('o', 5));

        // lastIndexOf()
        System.out.println("s1.lastIndexOf('o'): " + s1.lastIndexOf('o'));
        System.out.println("s1.lastIndexOf('o', 5): " + s1.lastIndexOf('o', 5));  // search backwards from index 5
        
    }
}
