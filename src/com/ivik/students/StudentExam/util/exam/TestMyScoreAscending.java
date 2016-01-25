package com.ivik.students.StudentExam.util.exam;

import com.ivik.students.StudentExam.util.SortByStudentScoreAscending;
import com.ivik.students.StudentExam.util.SortByStudentScoreDescending;
import com.ivik.students.StudentExam.util.StudentComparable;
import com.ivik.students.StudentExam.util.model.Student;
import com.ivik.students.StudentExam.util.SortUtils;


/**
 * Created by Christian on 25-1-2016.
 */
public class TestMyScoreAscending {
    public static void main(String[] args) {

        Student student1 = new Student("bob", 15);
        Student student2 = new Student("annie schmidt", 10);
        Student student3 = new Student("fred", 4.5);
        Student student4 = new Student("tom", 90.888);
        Student student5 = new Student("susan smith", 85.68);

        Student[] students = new Student[]{student1, student2, student3, student4, student5};

        StudentComparable sortByScoreAscending = new SortByStudentScoreAscending();
        StudentComparable sortByScoreDescending = new SortByStudentScoreDescending();


        System.out.println("** Ascending order **");
        SortUtils.sortStudent(students, sortByScoreAscending);
        for (Student student : students) {
            System.out.format("Name : %-15s : Score %6.2f \n", student.getName(), student.getScore());
        }
        System.out.println();
        System.out.println("** Descending order **");

        SortUtils.sortStudent(students, sortByScoreDescending);
        for (Student student : students) {
            System.out.format("Name : %-15s : Score %6.2f \n", student.getName(), student.getScore());
        }
    }
}
