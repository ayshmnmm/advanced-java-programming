package MISC;
// write a java program to create a custom exception (user defined) 
// use try, catch, throw, throws and finally

class MangoLeavesError extends Exception {
    MangoLeavesError(String str) {
        super(str);
    }
} 

public class ExceptionDemo {
    static void getMangoes(int n) throws MangoLeavesError {
        if (n > 10) 
            throw new MangoLeavesError("Error: too many mangoes! ("+n+" mangoes)");
        else
            System.out.println("success?");
    }
    public static void main(String[] args){
        try {
            getMangoes(49);
        }
        catch (MangoLeavesError m) {
            System.out.println("Caught --> " + m);
        }
        finally {
            System.out.println("finally, the end.");
        }
    }
}
