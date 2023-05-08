public class Utility {
    public static void main(String[] args) {
        Integer iObj1 = new Integer(100); // DEPRECATED
        Integer iObj2 = 100;                    // AUTO-BOXING
        int n = iObj2;                          // AUTO-UNBOXING

        String s = "678";
        int i = Integer.parseInt(s); //=> return int
        int j = Integer.valueOf(s);  //=> return Integer

        //Heap or pool?
        String s1 = new String("abc");
        String s2 = "abc"; // "abc" ở đây là hằng xâu
        String s3 = "abc";
        String s4 = new String("abc");

        System.out.println(s1 == s2); //F
        System.out.println(s2 == s3); //T
        System.out.println(s3 == s4); //F
    }    


}
