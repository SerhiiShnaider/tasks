package zadach.po.programmirovaniyu.partOne.Integer;

import java.util.Scanner;

/**
 * Created by Elvis on 04.12.2016.
 */

/*Дано трехзначное число. Вывести число, полученное
при перестановке цифр сотен и десятков исходного
числа (например, 123 перейдетв 213).*/

public class Integer15 {
    public static void main(String[] args) {
        System.out.print("type integer = ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        String newNumber = "" + ((number / 10) % 10) + (number / 100) + (number % 10);
        System.out.println("new number = " + newNumber);
        scanner.close();
    }
}
