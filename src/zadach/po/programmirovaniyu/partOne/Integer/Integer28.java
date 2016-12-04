package zadach.po.programmirovaniyu.partOne.Integer;

import java.util.Scanner;

/**
 * Created by Elvis on 04.12.2016.
 */

/*Дни недели пронумерованы следующим образом: 1 — понедельник,
2 — вторник, …, 6 — суббота, 7 — воскресенье. Дано целое число K,
лежащее в диапазоне 1–365, и целое число N, лежащее в диапазоне 1–7.
Определить номер дня недели для K-го дня года, если известно, что в этом
году 1 января было днем недели с номером N.*/

public class Integer28 {
    public static void main(String[] args) {
        System.out.print("type number from 1 to 365 = ");
        Scanner scanner = new Scanner(System.in);
        int countOfDays = scanner.nextInt();
        System.out.print("type number from 1 to 7 = ");
        int numberOfStartDay = scanner.nextInt();
        if (countOfDays >= 1 && countOfDays <= 365 && numberOfStartDay >=1 && numberOfStartDay <=7) {
            int numberOfDay = (countOfDays + (numberOfStartDay - 1)) % 7;
            if (numberOfDay == 1)
                System.out.println("it will bee Monday");
            else if (numberOfDay == 2)
                System.out.println("it will bee Tuesday");
            else if (numberOfDay == 3)
                System.out.println("it will bee Wednesday");
            else if (numberOfDay == 4)
                System.out.println("it will bee Thursday");
            else if (numberOfDay == 5)
                System.out.println("it will bee Friday");
            else if (numberOfDay == 6)
                System.out.println("it will bee Saturday");
            else
                System.out.println("it will bee Wednesday");
        } else
            System.out.println("invalid data");
        scanner.close();
    }
}
