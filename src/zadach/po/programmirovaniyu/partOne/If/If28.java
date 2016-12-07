package zadach.po.programmirovaniyu.partOne.If;

import java.util.Scanner;

/**
 * Created by Elvis on 07.12.2016.
 */

/*Дан номер года (положительное целое число). Определить количество
дней в этом году, учитывая, что обычный год насчитывает 365 дней, а
високосный — 366 дней. Високосным считается год, делящийся на 4, за
исключением тех годов, которые делятся на 100 и не делятся на 400
(например, годы 300, 1300 и 1900 не являются високосными, а 1200 и
2000 — являются).*/

public class If28 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("type number of year = ");
        int year = scanner.nextInt();
        if (year > 0) {
            if (year % 4 == 0) {
                if (year % 100 == 0 && year % 400 != 0)
                    System.out.print("in this year 365 days");
                else
                    System.out.println("in this year 366 days");
            } else
                System.out.print("in this year 365 days");
        } else
            System.out.print("invalid data");
    }
}
