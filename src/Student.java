import java.util.Objects;

public class Student {
    private Integer id;
    private String name;
    private Integer age;
    private String schoolName;

    public Student() {
    }

    public Student(Integer id, String name, Integer age, String schoolName) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.schoolName = schoolName;
    }

    public Student(String name, Integer age, String schoolName) {
        this.name = name;
        this.age = age;
        this.schoolName = schoolName;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(id, student.id) && Objects.equals(name, student.name) && Objects.equals(age, student.age) && Objects.equals(schoolName, student.schoolName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, age, schoolName);
    }
}
