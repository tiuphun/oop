package lesson4;

public class Student {
    private String name;
    private int age;    // -> set all attributes to private

    // The corresponding public method to let client modify age from outside
    public void setAge (int a) {
        if (a > 0) {
            age = a;
        }
        else {
            System.out.println("Invalid age");
        }
    }    

    protected void printInfo () {
        System.out.println(name + age);    
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}