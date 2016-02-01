/**
 * Created by Christian on 25-1-2016.

public class TestExceptions {

   private double averageScore (double totalScore, String noStudentsAsString) {
       int noStudents = Integer.parseInt(noStudentsAsString);
       double result = totalScore/noStudents;
       return result;
    }

    public void testAverages(){

    }

    public static void main(String[] args) {
        // testAverages test1 = new testAverages(900, "10");
       // System.out.println("Average score of " + () + "is " + (AverageScore(900, 10)));
    }

}

/*
    void totalScore(double score) throws ArithmeticException {
        System.out.println("Average score of " + (AverageScore(900, 10)) + "is " + (AverageScore(900,10)));
        if (score <= 0) throw new ArithmeticException();
    }

    void noStudentsAsString (String number) throws NumberFormatException {
        System.out.println("Average score of " + (AverageScore(900, 10)) + "is " + (AverageScore(900, 10)));

        if (noStudents != Integer.valueOf(number)) throw new NumberFormatException();
    }

    public static void main(String[] args) {

    try {   TestExceptions test1 = new TestExceptions (900, 10);


            double result = totalScore/noStudents;
            return result;
            }

        catch () {
        }

    }
        if (noStudents <= 0) ;
        System.out.println("Average score of " +

    AverageScore(totalScore, noStudentsAsString) {
        AverageScore = totalScore/noStudents;
    }

    + " resulted in a Arithmetic Exception");

        try {noStudents = Integer.valueOf(noStudentsAsString);
                System.out.println("Average score of " + AverageScore(totalScore, noStudentsAsString) + "resulted in NumberFormatException");
             }
                catch (NumberFormatException nfe)
                {

        }


    }

    public static void main(String[] args) {

       System.out.println("Average score of " + (AverageScore(900, "10")) + " is " + (AverageScore(900, "10")));
       System.out.println("Average score of " + (AverageScore(900, "oops")) + "is " + (AverageScore(900, "oops")));

    }
}

*/
/*

Stap 3
Create a main method to call your averages method and it should print the following :
Average score of (900,”10”) is 90
Average score of (90,”oops”) resulted in NumberFormatException
Average score of (90,”0”) resulted in a ArithmeticException
Change the class and method/s in stap1 en of stap 2 so that you can achieve the correct result.        }


    Average score of 90.0is 90.0
        Exception in thread "main" java.lang.NumberFormatException: For input string: "oops"
        at java.lang.NumberFormatException.forInputString(NumberFormatException.java:65)
        at java.lang.Integer.parseInt(Integer.java:492)
        at java.lang.Integer.parseInt(Integer.java:527)
        Process finished with exit code 1

        at TestExceptions.averageScore(TestExceptions.java:8)
        at TestExceptions.main(TestExceptions.java:32)
        at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
        at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:57)
        at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
        at java.lang.reflect.Method.invoke(Method.java:606)
        at com.intellij.rt.execution.application.AppMain.main(AppMain.java:144)

*/


class Parms {

    private double total;
    private String noStudentsAsString;

    double getTotal() {
        return total;
    }
    void setTotal(double total) {
        this.total = total;
    }

    String getNoStudentsAsString() {
        return noStudentsAsString;
    }
    void setNoStudentsAsString(String noStudentsAsString) {
        this.noStudentsAsString = noStudentsAsString;
    }

    Parms(double total, String noStudentsAsString) {
        this.total = total;
        this.noStudentsAsString = noStudentsAsString;
    }
}

public class TestExceptions {

    private static final String CORRECT_RESULT = "Average score of (%5.2f,%s) is %5.2f\n";
    private static final String INVALID_RESULT = "Average score of (%5.2f,%s) resulted in a  %s\n";

    private double calcAverage(double total, String noStudentsAsStr) {

        // note better to use pattern matching first
        int noStudents = Integer.parseInt(noStudentsAsStr);

        // result of double / int is a double and it wont abend
        // therfore I have to do a trick first

        int check = 1 / noStudents;
        return total / noStudents;

    }


    private void testAverages() {

        Parms[] parms =
                new Parms[]{new Parms(900, "10"),
                new Parms(900, "0"),
                new Parms(900, "oops"),
                new Parms(900, "57")
        };

        for (Parms parm : parms) {

            try {

                double result = calcAverage(parm.getTotal(), parm.getNoStudentsAsString());
                System.out.format(CORRECT_RESULT, parm.getTotal(), parm.getNoStudentsAsString(), result);
            } catch (RuntimeException e) {
                System.out.printf(INVALID_RESULT, parm.getTotal(), parm.getNoStudentsAsString(), e.getClass().getSimpleName());
            }
        }

    }

    public static void main(String[] args) {
        new TestExceptions().testAverages();

    }

}