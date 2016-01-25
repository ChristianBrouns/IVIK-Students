/**
 * Created by Christian on 25-1-2016.
 */
public class TestExceptions {

    private static double averageScore(double totalScore, String noStudentsAsString)
            throws ArithmeticException{
        double noStudents = Integer.parseInt(noStudentsAsString);
        double averageScore = totalScore / noStudents;
        if (noStudents <= 0) throw new ArithmeticException("Average score of (900, '0') resulted in a Arithmetic Exception");

            try {noStudents = Integer.valueOf(noStudentsAsString);
             }
                catch (NumberFormatException nfe)
                {
            System.out.println("Average score of " + noStudentsAsString + "resulted in NumberFormatException");
        }
        return averageScore;
    }
     public double testAverages () {

         averageScore (900, "10");
         averageScore(90, "oops");
         averageScore(90, "0");

         return testAverages();
    }


    public static void main(String[] args) {
       System.out.println("Average score of " + (averageScore(900, "10")) + "is " + averageScore(900, "10"));
       System.out.println("Average score of (900, 'oops')" + "is " + averageScore(900, "oops"));
       System.out.println("Average score of (900, '0')" + "is " + averageScore(900, "0"));
    }
}

/*

Stap 3
Create a main method to call your averages method and it should print the following :
Average score of (900,”10”) is 90
Average score of (90,”oops”) resulted in NumberFormatException
Average score of (90,”0”) resulted in a ArithmeticException
Change the class and method/s in stap1 en of stap 2 so that you can achieve the correct result.        }
 */