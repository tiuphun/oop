package lesson2;
public class datatypes{
    public static void main(String[] args){
        int i = 6;
        long l = i; // implicit cast (widening) -> automatic

        i = l; // <- wrong: explicit cast (narrowing)
        i = (int) l; // <- rewritten

        short h = 6, k = 7;
        short l = h + k; // <- wrong: Java do not add 2 short number => data type promoter: Java converts to int
        short l = (int) (h + k); // <- rewritten

        // int <-> char
        char c1 = 'A';
        int i = c1;
        char c2 = (char) i;

        float f = 5.6; // <- wrong, Java understands as double (default point decimal type)
        float f = 5.6f; // <- rewritten

        long l = 9999999999999; // <- wrong, Java understands as int (default no-point decimal type)
    }
}
