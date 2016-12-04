package zadach.po.programmirovaniyu.partOne.Integer;

import java.util.Scanner;

/**
 * Created by Elvis on 04.12.2016.
 */

/*Дано трехзначное число. Вывести вначале его последнюю цифру
(единицы), а затем — его среднюю цифру (десятки)*/

public class Integer10 {
    public static void main(String[] args) {
        System.out.print("type integer = ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int leftNumber = number % 10;
        int middleNumber = (number / 10) % 10;
        System.out.println("left number = " + leftNumber + "\nmiddle number = " + middleNumber);
        scanner.close();
    }
}
