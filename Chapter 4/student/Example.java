package student;
public class Example {
    public static void increase(Student std){
        std.setAge(std.getAge() + 1);
    }

    public static void main(String[] args) {
        Student s = new Student("Nam", 20);
        // s không phải là một đối tượng, mà là biến tham chiếu trỏ đến {"Nam", 20}
        increase(s);
        // Khi đưa s vào hàm, Java tạo một biến tham chiếu mới s' = s
        System.out.println(s.getAge());
    }
}
