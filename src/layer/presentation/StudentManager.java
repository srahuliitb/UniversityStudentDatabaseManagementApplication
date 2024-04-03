package layer.presentation;

import java.util.ArrayList;
import java.util.List;

public class StudentManager {
    private final List<Student> students;

    public StudentManager() {
        students = new ArrayList<>();
    }

    public int noOfStudents(String typeOfStudent) {
        return (int) students.stream().filter(student -> student.getType().equals(typeOfStudent)).count();
    }

    public void registerStudent(Student student) {
        students.add(student);
    }

    public void amendStudentData(String studentID, String studentData) {
        // Implement as needed
    }

    public void terminateStudent(String studentID) {
        students.removeIf(student -> student.getID().equals(studentID));
    }
}
