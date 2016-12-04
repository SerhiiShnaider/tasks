package zadach.po.programmirovaniyu.partOne.Integer;

import java.util.Scanner;

/**
 * Created by Elvis on 04.12.2016.
 */

/*Дан номер некоторого года (целое положительное число).
Определить соответствующий ему номер столетия, учитывая,
что, к примеру, началом 20 столетия был 1901 год*/

public class Integer30 {
    public static void main(String[] args) {
        System.out.print("type number of year = ");
        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();
        if(year > 0) {
            int century = (year / 100) + 1;
            System.out.println("it is " + century + " century");
        }else
            System.out.println("invalid data");
        scanner.close();
    }
}
