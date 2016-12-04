package zadach.po.programmirovaniyu.partOne.Integer;

import java.util.Scanner;

/**
 * Created by Elvis on 04.12.2016.
 */

/*Дни недели пронумерованы следующим образом: 0 — воскресенье,
1 — понедельник, 2 — вторник, …, 6 — суббота. Дано целое
число K, лежащее в диапазоне 1–365. Определить номер дня недели
для K-го дня года,если известно, что в этом году 1 января было понедельником.*/

public class Integer24 {
    public static void main(String[] args) {
        System.out.print("type number from 1 to 365 = ");
        Scanner scanner = new Scanner(System.in);
        int countOfDays = scanner.nextInt();
        if (countOfDays >= 1 && countOfDays <= 365) {
            int numberOfDay = countOfDays % 7;
            if (numberOfDay == 0)
                System.out.println("it will bee Wednesday");
            else if (numberOfDay == 1)
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
        } else
            System.out.println("invalid data");
        scanner.close();
    }
}
