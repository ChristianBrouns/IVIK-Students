package com.ivik.students.StudentExam.util.model;

/**
 * Created by Christian on 11-1-2016.
 */
public class Student {
    private String name;
    private double score;

    public Student(String name, double score) {
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return this.name;
    }

    public double getScore() {
        return this.score;
    }

}

