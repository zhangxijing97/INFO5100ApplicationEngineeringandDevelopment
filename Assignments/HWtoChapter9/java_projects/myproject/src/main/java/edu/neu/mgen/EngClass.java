package edu.neu.mgen;

import java.util.ArrayList;
import java.util.List;

public class EngClass {
    private List<Student> students;

    public EngClass() {
        this.students = new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void deleteStudent(int studentID) {
        for (Student student : students) {
            if (student.getStudentId() == studentID) {
                students.remove(studentID);
            }
        }
    }

    public void listStudents() {
        if (students.isEmpty()) {
            System.out.println("No students enrolled.");
        } else {
            for (Student student : students) {
                // Directly format the string here instead of using student's toString method
                String studentInfo = "Student ID: " + student.getStudentId() +
                        ", Name: " + student.getFirstName() + " " + student.getLastName();
                System.out.println(studentInfo);
            }
        }
    }

}
