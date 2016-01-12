package com.ivik.students.util;

import com.ivik.students.model.Student;

/**
 * Created by Christian on 11-1-2016.
 */
public class SortUtils {
    public static void sortStudent(Student[] students){

        boolean sorted = true;
        int j = 0;
        Student temp;
        while (sorted) {
            sorted = false;
            j++;

            for (int i =  0; i < students.length - j; i++){
                if (students[i] > students[i+1] {
                    temp = students[i];
                    students[i] = students[i + 1];
                    students[i + 1] = temp;
                    sorted = true;
                }
        }
    }
}
}
