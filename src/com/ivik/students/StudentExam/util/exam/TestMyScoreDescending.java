package com.ivik.students.StudentExam.util.exam;

import com.ivik.students.StudentExam.util.SortByStudentScoreDescending;
import com.ivik.students.StudentExam.util.StudentComparable;
import com.ivik.students.StudentExam.util.model.Student;
import com.ivik.students.StudentExam.util.SortUtils;

/**
 * Created by Christian on 25-1-2016.
 * Redundant; can also be done in TestMyScorAscending
 */

public class TestMyScoreDescending {
    public static void main(String[] args) {

        Student student1 = new Student( "bob burger" , 15 );
        Student student2 = new Student( "annie schmidt" , 10 );
        Student student3 = new Student( "fred fibonacci" , 4.5 );
        Student student4 = new Student( "tom toolkit" , 90.888 );
        Student student5 = new Student( "susan smith" , 85.68 );

        Student[] students = new Student[]{student1,student2,student3,student4,student5};

        StudentComparable sortByScoreDescending = new SortByStudentScoreDescending();

        SortUtils.sortStudent (students, sortByScoreDescending);
        for (Student student : students){
            System.out.format("Name : %-15s : Score %6.2f \n", student.getName(), student.getScore());
        }
    }

}
