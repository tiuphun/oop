// Java only pass-by-value for all types of data.
public class PassingParameter {
    public static void increase(int i) {
        i++;
    }

    public static void main(String[] args) {
        int i = 5;
        increase(i);
        System.out.println(i); //=> i = 5
    }

    
}