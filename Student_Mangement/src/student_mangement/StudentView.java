/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package student_mangement;

import java.util.ArrayList;
import java.util.Collections;

import Model.Student;
import Validation.Validation;

/**
 *
 * @author Lul
 */
public class StudentView {
    public void menu() {
        System.out.println("STUDENT MANAGEMENT");
        System.out.println("______________");
        System.out.println(" 1.	Create");
        System.out.println(" 2.	Find and Sort");
        System.out.println(" 3.	Update/Delete");
        System.out.println(" 4.	Report");
        System.out.println(" 5.	Exit");
        System.out.print(" Enter your choice: ");
    }

    public void createStudent(int count, ArrayList<Student> S) {
        if (count > 10) {
            System.out.println("Do you want to continue(Y/N):");

        }
        while (true) {
            System.out.print("Enter id: ");
            String id = Validation.checkInputString();
            System.out.print("Enter name student: ");
            String name = Validation.checkInputString();
            if (!Validation.checkIdExist()) {
                System.err.println("Id has exist student. Pleas re-input.");
                continue;
            }
            System.out.print("Enter semester: ");
            String semester = Validation.checkInputString();
            System.out.print("Enter name course: ");
            String course = Validation.checkInputCourse();
            if (Validation.checkStudentExist()) {
                ;
                count++;
                System.out.println("Add student success.");
                return;
            }
            System.err.println("Duplicate.");

        }
    }

    public void findAndSort(ArrayList<Student> S) {
        if (S.isEmpty()) {
            System.err.println("List empty.");
            return;
        }
        ArrayList<Student> listStudentFindByName = listStudentFindByName(S);
        if (listStudentFindByName.isEmpty()) {
            System.err.println("Not exist.");
        } else {
            Collections.sort(listStudentFindByName);
            System.out.printf("%-15s%-15s%-15s\n", "Student name", "semester", "Course Name");
            for (Student student : listStudentFindByName) {
                student.print();
            }
        }

    }

    private ArrayList<Student> listStudentFindByName(ArrayList<Student> S) {
        ArrayList<Student> listStudentFindByName = new ArrayList<>();
        System.out.println("Enter name to search:");
        String name = Validation.checkInputString();
        for (Student student : S) {
            if (student.getName().contains(name)) {
                listStudentFindByName.add(student);
            }
        }
        return listStudentFindByName;
    }

    public void updateOrDelete(int count, ArrayList<Student> S) {
        if (S.isEmpty()) {
            System.out.println("List empty.");
            return;
        }
        System.out.println("Enter id:");
        String id = Validation.checkInputString();

    }
}
