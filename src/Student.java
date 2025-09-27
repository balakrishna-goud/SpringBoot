import java.util.Objects;

public class Student {
    String name;
    Integer age;
    String schoolName;

    public Student(String name, Integer age, String schoolName) {
        this.name = name;
        this.age = age;
        this.schoolName = schoolName;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(name, student.name) && Objects.equals(age, student.age) && Objects.equals(schoolName, student.schoolName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, schoolName);
    }
}
