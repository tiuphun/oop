package student;
public class Student {
    // CLASS MEMBER
    public static String UNIVERSITY = "HUST";       // -> CONSTANT MEMBER [OF CLASS]

    // INSTANT MEMBER: Belong to each object - when name of one instance is change does not affect the others'
    public final String NATIONALITY = "Vietnam";    // -> CONSTANT MEMBER [OF OBJECT]
    private int age;
    private String name;

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setName(String name) {
        this.name = name;
    }

    public Student() {
        // NATIONALITY = "Japanese"; -> This assignment is not allowed
    }
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public static void main(String[] args) {
        Student s1 = new Student("Alice", 20);
        Student s2 = new Student("Bob", 20);
        
        // Class member should be accessed from the class, not from object
        s1.UNIVERSITY = "FTU";      // x
        Student.UNIVERSITY = "FTU"; // o
        // Instance member is accessed from object
        s2.setName("Colin");
    }
}
