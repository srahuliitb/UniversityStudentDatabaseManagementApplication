package layer.presentation;

public class Main {
    public static void main(String[] args) {
        // Sample usage of the classes
        StudentManager studentManager = new StudentManager();

        // Registering students
        Undergraduate undergraduate = new Undergraduate("U1234");
        studentManager.registerStudent(undergraduate);

        PostgraduateTaught postgraduateTaught = new PostgraduateTaught("PGT5678");
        studentManager.registerStudent(postgraduateTaught);

        PostgraduateResearch postgraduateResearch = new PostgraduateResearch("PGR91011", "Dr. Smith");
        studentManager.registerStudent(postgraduateResearch);

        // Terminating a student
        studentManager.terminateStudent("U1234");

        // Getting number of students
        System.out.println("Number of undergraduates: " + studentManager.noOfStudents("UG"));
        System.out.println("Number of postgraduate taught: " + studentManager.noOfStudents("PGT"));
        System.out.println("Number of postgraduate research: " + studentManager.noOfStudents("PGR"));
    }
}
