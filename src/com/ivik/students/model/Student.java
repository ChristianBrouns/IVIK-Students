package com.ivik.students.model;

/**
 * Created by Christian on 11-1-2016.
 */
public class Student {
    private String name;
    private double score;
    public Student(String name, double score) {

    }
    public String getName()
    {
        return this.name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public double getScore()
    {
        return this.score;
    }

    public void setScore(double score)
    {
        this.score = 0.00;
    }
}
