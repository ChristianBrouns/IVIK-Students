package com.ivik.students.StudentExam.util;
import com.ivik.students.StudentExam.util.model.Student;

/**
 * Created by Christian on 11-1-2016.
 */

//Bubble sort method for ascending order

public abstract class SortUtils implements StudentComparable {
    public static void sortStudent(Student[] students, StudentComparable compare) {

        boolean sorted = false;
        Student temp;

        while (!sorted) {

            sorted = true;

            for (int i = 0; i < students.length - 1; i++) {

                int swap = compare.compareTo(students[i], students[i + 1]); // < swap used your implementation
                if (swap == 0) { // elements same no swap needed
                    continue;
                } else if (swap == 1) { // considered less than
                    temp = students[i];
                    students[i] = students[i + 1];
                    students[i + 1] = temp;
                    sorted = false;

                }
            }
        }
    }


}

                    /* // old code//

                if (students[i].getScore() > students[i+1].getScore()) {

                    Student temp = students[i];
                    students[i] = students[i+1];
                    students[i+1] = temp;
                    sorted = true;

                }
            }
        }
    }
}*/