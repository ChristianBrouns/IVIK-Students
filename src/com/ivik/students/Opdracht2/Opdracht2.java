package com.ivik.students.Opdracht2;
import java.util.Arrays;

/**
 * Created by Christian on 13-1-2016.
 */
public class Opdracht2 {
    public static void main(String[] args) {
        int[] numbers = {5, 20, 40, 15, 1, 30, 100, 6, 300, 23, 48};
        {
            Arrays.sort(numbers);
                    }

        int i = 0;
        for (int temp : numbers) {
            System.out.println("number " + ++i + " = " + temp);
        }
        System.out.println();

        int j = 2;
        for (int temp : Arrays.copyOfRange(numbers, 2, 8)) {
            System.out.println("number " + ++j + " = " + temp);
        }
    }
}

  /*Opdracht 2
In deze opracht maak je gebruik van de java class Arrays
(Klik hier voor api ).

Schrijf een java class.
Maak een array van integers aan die bevat de volgende elementen.
5,20,40,15,1,30,100,6,300,23,48

Met gebruik van de Arrays class:
sorteer deze array en prnit de waarden out.

Nu ook met behulp van de Arrays class:
kopieer elementen (3 t/m 8( waarden 15 t/m 300)) naar een nieuwe array
sorteer en print de nieuwe   array.

	sort(int[] a)
Sorts the specified array into ascending numerical order.

	copyOfRange(T[] original, int from, int to)
Copies the specified range of the specified array into a new array.
copyOfRange(U[] original, int from, int to, Class<? extends T[]> newType)
*/