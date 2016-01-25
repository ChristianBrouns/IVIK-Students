package com.ivik.students.StudentExam.util.exam;

import com.ivik.students.StudentExam.util.StudentComparable;
import com.ivik.students.StudentExam.util.model.Student;
import com.ivik.students.StudentExam.util.SortUtils;

/**
 * Created by Christian on 11-1-2016.
 * Na aanpassen van dit programma door toevoegen van een interface is deze class overbodig geworden en niet meer werkzaam.
 *
 */
public class StudentExamScores {
    public static void main(String[] args) {}

    private Student[] students;
    public StudentExamScores() {
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


    public void reportStudentScores (Student[] students, StudentComparable compare) {
        SortUtils.sortStudent(students, compare);

        System.out.format("%s\t%18s%n", "Name", "Score");
        System.out.format("%s\t%s%n", "------------------", "---------");

        for (int i = 0; i < students.length; i++) {
            String name = students[i].getName();
            double score = students[i].getScore();
            System.out.format("%-5s\t%18.2f%n", name, score);
        }
    }
}




