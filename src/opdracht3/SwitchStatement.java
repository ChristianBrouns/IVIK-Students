package opdracht3;

/**
 * Created by Christian on 13-1-2016.
 */
public class SwitchStatement {
    public static String convertMonth (int month) {

        String monthname;

        switch (month) {
            case 1:
                monthname = "januari";
                break;
            case 2:
                monthname = "februari";
                break;
            case 3:
                monthname = "march";
                break;
            case 4:
                monthname = "april";
                break;
            case 5:
                monthname = "may";
                break;
            case 6:
                monthname = "june";
                break;
            case 7:
                monthname = "july";
                break;
            case 8:
                monthname = "august";
                break;
            case 9:
                monthname = "september";
                break;
            case 10:
                monthname = "october";
                break;
            case 11:
                monthname = "november";
                break;
            case 12:
                monthname = "december";
                break;
            case 13:
                monthname = "invalid mont";
                break;
            default:
                monthname = "invalid month";
                break;

        }
        return monthname;
    }

    public static void main(String[] args) {
        System.out.println("the name of the month = " + SwitchStatement.convertMonth(10));
    }
}









/*Switch (byte, short, int, char, Stringof Enum) {
// }
// bijvoorbeeld int result = 5
// Switch(result){
// case: 1
// case: 2
// case: 3
// default]
// print alle volgende vanaf de case die waar is. Tenzij er volgt "break;"
//Schrijf java class die gebruik maakt van Switch en die converteert 1 t/m 12 met de naam van de maand.

Opdracht 3
Write een java class dat een methode heeft dat converteerd een int naar een String.
De methode moet gebruik maken van de switch statement.
Signature van de methode is
public static String convertMonth(int month)
b.v. ConvertMonth(1) is “januari”
convertMonth(2) is ‘fevruari”
convertMonth(13) is “Invalid month”

*/
