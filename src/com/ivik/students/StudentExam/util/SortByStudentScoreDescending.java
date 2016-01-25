package com.ivik.students.StudentExam.util;

import com.ivik.students.StudentExam.util.model.Student;

/**
 * Created by Christian on 25-1-2016.
 */
public class SortByStudentScoreDescending implements StudentComparable {
    @Override
    public int compareTo(Student student1, Student student2) {
        if ( student1.getScore() == student2.getScore()){
            return 0;
        }

// we want sort ascending so ensure swap by returning 1

        if ( student1.getScore() > student2.getScore() ){
            return -1;
        }
        return 1;
    }
}


