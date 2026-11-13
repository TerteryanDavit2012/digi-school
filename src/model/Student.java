package model;

import java.util.Objects;

public class Student implements Comparable<Student> {
    private String fullName;
    private int age;

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + fullName + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return age == student.age &&
                Objects.equals(fullName, student.fullName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fullName, age);
    }

    @Override
    public int compareTo(Student o) {
        int result = this.getFullName()
                .compareToIgnoreCase(o.getFullName());

        if (result == 0) {
            return Integer.compare(this.getAge(), o.getAge());
        }

        return result;
    }
}
