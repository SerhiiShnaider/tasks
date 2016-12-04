package zadach.po.programmirovaniyu.partOne.Integer;

import java.util.Scanner;

/**
 * Created by Elvis on 04.12.2016.
 */

/*Дано целое число, большее 999. Используя одну операцию деления
нацело и одну операцию взятия остатка от деления, найти цифру,
соответствующую разряду сотен в записи этого числа.*/

public class Integer17 {
    public static void main(String[] args) {
        System.out.print("type integer > 999 = ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        if (number >= 999) {
            String newNumber = "" + ((number / 100) % 10);
            System.out.println("hundreds in number = " + newNumber);
        } else {
            System.out.println("invalid data");
        }
        scanner.close();
    }
}
