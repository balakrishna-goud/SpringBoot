import java.util.*;
import java.util.stream.Collectors;

public class StudentRepository {
    private static final Map<Integer, Student> students = new HashMap<>();
    private static int nextId = 5;

    static {
        // Initialize with mocked data
        students.put(1, new Student(1, "Alice Johnson", 18, "Central High School"));
        students.put(2, new Student(2, "Bob Smith", 17, "Westside Academy"));
        students.put(3, new Student(3, "Charlie Brown", 19, "North Valley High"));
        students.put(4, new Student(4, "Diana Prince", 18, "Riverside School"));
    }

    public List<Student> findAll() {
        return new ArrayList<>(students.values());
    }

    public Optional<Student> findById(Integer id) {
        return Optional.ofNullable(students.get(id));
    }

    public Student save(Student student) {
        if (student.getId() == null) {
            student.setId(nextId++);
        }
        students.put(student.getId(), student);
        return student;
    }

    public void deleteById(Integer id) {
        students.remove(id);
    }

    public boolean existsById(Integer id) {
        return students.containsKey(id);
    }

    public long count() {
        return students.size();
    }
}
