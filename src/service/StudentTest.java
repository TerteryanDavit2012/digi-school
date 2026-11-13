import model.Student;

import java.io.IOException;
import java.util.ArrayList;
import service.StudentService;

public class StudentTest {
    public static void main(String[] args) throws IOException {
        Student student1 = new Student();
        student1.setFullName("Aram Sargsyan");
        student1.setAge(19);

        Student student2 = new Student();
        student2.setFullName("Narek Grigoryan");
        student2.setAge(21);

        Student student3 = new Student();
        student3.setFullName("Hayk Petrosyan");
        student3.setAge(20);

        Student student4 = new Student();
        student4.setFullName("Gor Hakobyan");
        student4.setAge(18);

        Student student5 = new Student();
        student5.setFullName("Tigran Vardanyan");
        student5.setAge(22);

        ArrayList<Student> students = new ArrayList<>();

        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        students.add(student5);

        StudentService.createSortedStudentFile(students, "students.txt");
    }
}