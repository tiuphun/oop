package chap6.inheritance;

public class Lecturer extends Person {
    private int yearsofExperience;

    public Lecturer(String name, int age, int yearsofExperience) {
        this.name = name;
        this.age = age;
        this.yearsofExperience = yearsofExperience;
    }
}
