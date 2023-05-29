package chap2;

public class foreach {
    public static void main(String[] args){
        int[] a = {1, 2, 3, 4}

        // Best for traversal of values 
        for (int i:a) {
            System.out.println(i);
        }

        // Best for index access, value modification
        for (int i = 0; i < a.length; i++){
            System.out.println(a[i]);
        }
    }
}