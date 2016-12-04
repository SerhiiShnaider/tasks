package zadach.po.programmirovaniyu.partOne.Integer;

import java.util.Scanner;

/**
 * Created by Elvis on 04.12.2016.
 */

/*Дано трехзначное число. Используя одну операцию деления нацело,
вывести первую цифру данного числа (сотни).*/

public class Integer9 {
    public static void main(String[] args) {
        System.out.print("type integer = ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int leftNumber = number / 100;
        System.out.println("left number = " + leftNumber);
        scanner.close();
    }
}
