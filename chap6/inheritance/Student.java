package chap6.inheritance;

import java.util.Date;

public class Student extends Person {
    private Date entranceDate;
    
    public Student (String name, int age, Date entranceDate) {
        this.name = name;
        this.age = age;
        this.entranceDate = entranceDate;
    }
}
