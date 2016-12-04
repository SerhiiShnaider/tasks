package zadach.po.programmirovaniyu.partOne.Integer;

import java.util.Scanner;

/**
 * Created by Elvis on 04.12.2016.
 */

/*Дано трехзначное число. В нем зачеркнули первую слева цифру и
приписали ее справа. Вывести полученное число.*/

public class Integer13 {
    public static void main(String[] args) {
        System.out.print("type integer = ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        String newNumber = "" + ((number / 10) % 10) + (number % 10) + (number / 100);
        System.out.println("new number = " + newNumber);
        scanner.close();
    }
}
