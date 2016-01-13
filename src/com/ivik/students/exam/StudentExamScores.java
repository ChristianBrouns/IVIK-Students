package com.ivik.students.exam;

import com.ivik.students.model.Student;
import com.ivik.students.util.SortUtils;

/**
 * Created by Christian on 11-1-2016.
 */
public class StudentExamScores {

    private Student[] students;
    public StudentExamScores(){
        initExamScores();
    }
    private void initExamScores() {
        Student student1 = new Student("Ruud", 55.60);
        Student student2 = new Student("Arjan", 10.50);
        Student student3 = new Student("Tom", 85.00);
        Student student4 = new Student("Fred", 96.50);
        Student student5 = new Student("Marcus", 5.60);

        students = new Student[]{student1, student2, student3, student4, student5};
    }


    public void reportStudentScores() {
        SortUtils.sortStudent(students);

        System.out.format("%s\t%18s%n", "Name", "Score");
        System.out.format("%s\t%s%n", "------------------", "---------");

        for (int i = 0; i < students.length; i++) {
            String name = students[i].getName();
            double score = students[i].getScore();
            System.out.format("%-5s\t%18.2f%n", name, score);
        }
    }

    public static void main(String[] args) {

        new StudentExamScores().reportStudentScores();

    }
}
//Question: how to allocate space for a fixed number of characters in a String?