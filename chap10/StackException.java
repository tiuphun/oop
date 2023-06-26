package chap10;

public class StackException extends Exception {
    public static int divideByZero(int i) {
        return i/0;
    }
    public static void main(String[] args) {
        System.out.println("StackException");
        System.out.println("----------------------");

        try {
            System.out.println("START try()");
            int result = divideByZero(5);
            System.out.println("result = " + result);
        } catch (Exception e) {
            System.out.println(e.getMessage()); // <- print the message of the exception
            e.printStackTrace(); // <- traverse back and up the stack to find the exception
        } finally {
            System.out.println("FINALLY"); // <- always run whether exception exits or not
        }

        System.out.println("---------------------");
        System.out.println("END");
    }
}