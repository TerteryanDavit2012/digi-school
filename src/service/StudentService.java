package service;
import model.Student;
import java.io.IOException;
import java.util.ArrayList;
import java.util.TreeSet;

public class StudentService {
    public static void createSortedStudentFile(
            ArrayList<Student> students, String url) throws IOException {

        TreeSet<Student> sortedStudents = new TreeSet<>(students);

        StringBuilder content = new StringBuilder();

        for (Student student : sortedStudents) {
            content.append(student.getFullName())
                    .append(", ")
                    .append(student.getAge())
                    .append(", ")
                    .append(System.lineSeparator());
        }

        FileService.writeFile(url, content.toString());
    }



}
