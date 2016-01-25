/**
 * Created by Christian on 18-1-2016.
 */

// narrowing primitive conversions

public class CastPrimitive {
    public static void main(String[] args) {
        double pi = 3.14;
        int wholePartPi = (int) pi; // cast double to int
        float piAsFloat = (float) pi; // cast double to float
        long mile = (long) 1609.34; // cast double to long

/*      byte c = 6; werkt
        byte b = c + 5; werkt niet
        c = c + 5; werkt niet
        c += 5; // cast automatisch.
        long d = 6; werkt
        d += 5; werkt
        f = d + 5; werkt
        byte b =(byte)128; // b is hier -128
*/

        System.out.println(wholePartPi);
        System.out.println(piAsFloat);
        System.out.println(mile);
            }
}


/*
* Opdracht 1   
* We hebben casting van objecten gezien in de les. 
* Casting van primitive variabelen is soms ook nodig. 
* Lees  de volgende artikel .. ​ https://docs.oracle.com/javase/specs/jls/se7/html/jls­5.html   
* Maak je eigen class om de volgende methode te corrigeren met gebruik van casting.   
* public static void main(String  [] args){   double pi =  3.14;   int wholePartPi = pi;  float piAsFloat = pi;  long mile = 1609,34;  } 

*/