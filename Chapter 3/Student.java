package lesson4;

public class Student {
    private String name;
    private int age;    // -> set all attributes to private

    public Student (String name, int age) {
        this.name = name;
        this.age = age;
    }
    public Student () {
        // TRUE
        this ("Default", 0);

        // Lengthy code
        this.name = "Default";
        this.age = 0;
        
        // Wrong call
        Student("Default", 0);
    }

    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public void setAge (int age) {
        if (a > 0) {
            this.age = age;
        }
        else {
            System.out.println("Invalid age");
        }
    }    

    public static void main (String[] args) {
        Student s = new Student();
        s.setAge(20); //=> this [in setAge()] = s

        Student s1 = new Student("Tieu", 20); //=> this [in Student()] = s1

    }

    protected void printInfo () {
        System.out.println(name + getAge());    
    }

    
}