package com.ivik.students.exam;

import com.ivik.students.model.Student;
import com.ivik.students.util.SortUtils;

/**
 * Created by Christian on 11-1-2016.
 */
public class StudentExamScores {

        Student student1 = new Student ("Ruud",55.60);
        Student student2 = new Student ("Arjan", 10.50);
        Student student3 = new Student ("Tom", 10.00);
        Student student4 = new Student ("Fred", 15.50);
        Student student5 = new Student ("Marcus", 85.60);

    private Student[] students = new Student[]{student1, student2, student3, student4, student5};

    public StudentExamScores(){initExamScores();}
    private void initExamScores(){

    }
    public void reportStudentScores(){
        SortUtils sortStudent;
        for (int i = 0; i < students.length; i++)
        System.out.println(students[i]);
    }

    public static void main(String[] args) {
        new StudentExamScores().reportStudentScores();
    }
}
