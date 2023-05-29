public class Memory {
    public static void main(String[] args) {
        Student m = new Student("Tieu", 20);
    }
    //=
    public static void test() {
        for (int i = 0; i < 100; i++) {
            Student m = new Student("Tieu", 20);
        }
        //=
        System.gc(); // Request garbage collector to run soon
    }

}

//= After this line the above reference is destroyed.