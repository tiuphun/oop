// Not object comparison: Ref comparison - whether they point to the same object
import student.Student;
public class Compare {
    public static void main(String[] args) {
        Student s1 = new Student("Tieu", 20);
        Student s2 = s1;
        Student s3 = new Student("Tieu", 20);

        System.out.println(s1 == s2); // T
        System.out.println(s1 == s3); // F
        System.out.println(s1.equals(s3)); // F -> equals() is universal, by default it is equivalent to "=="
    }

// How to compare 2 objects? -> Define custom 
    public boolean compare(Student s) {
        return (this.getName() == s.getName());
    }
}

// OVERWRITE
public boolean equals(Object obj) {
    return ()
}