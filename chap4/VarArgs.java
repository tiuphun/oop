public class VarArgs {
    public static int add (int ...a) {
        int result = 0;
        for (int i : a) {
            result += i;
        }
        return result;
    }

    public static int indiv (int a, int ...b) {
        int result = 0;
        for (int i : b) {
            result += i;
        }
        return result + a;
    }
    
    public static void main(String[] args) {
        System.out.println(add(1, 2, 4, 5, 7, 9));
        System.out.println(indiv(0, 2, 3, 4, 5, 6);
    }
    // INVALID: varargs should always come at the end, though in this case that could not be satisfy
    public static int various (int ...a, int ...b) {}
}

