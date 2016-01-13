package com.ivik.students.util;

import com.ivik.students.model.Student;

/**
 * Created by Christian on 11-1-2016.
 */

//Bubble sort method for ascending order

public class SortUtils {
    public static void sortStudent(Student[] students) {

        int i;
        boolean sorted = true;

        while (sorted) {

            sorted = false;

            for (i = 0; i < students.length - 1; i++) {

                if (students[i].getScore() > students[i+1].getScore()) {

                    Student temp = students[i];
                    students[i] = students[i+1];
                    students[i+1] = temp;
                    sorted = true;

                }
            }
        }
    }
}