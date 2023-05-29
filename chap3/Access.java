package lesson3;

public class Access {
    public int a1;  // PUBLIC   -> Accessible everywhere
    int a2;         // DEFAULT  -> Accessible inside package lesson3 only
    private int a3; // PRIVATE  -> Only accessible inside class A
    public final int a4;     // -> Constant member

    
    public void m1 () {
        // Inside the same class, all methods have access to other method
        m3();       
    }
    void m2 () {}
    private void m3 () {}
}
