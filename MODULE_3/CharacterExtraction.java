package MODULE_3;

public class CharacterExtraction {
    public static void main(String[] args) {
        String s = "Hello World";

        // charAt() method
        System.out.println("s.charAt(2) : "+s.charAt(2));

        // getChars() method
        char[] ch = new char[4];
        s.getChars(6, 8, ch, 0);
        System.out.println("ch: "+String.valueOf(ch));

        // toCharArray() method
        char[] ch1 = s.toCharArray();
        System.out.println("ch1 : "+String.valueOf(ch1));
    }
}
