package zadach.po.programmirovaniyu.partOne.Integer;

import java.util.Scanner;

/**
 * Created by Elvis on 04.12.2016.
 */

/* Дано трехзначное число. Найти сумму и произведение его цифр*/

public class Integer11 {
    public static void main(String[] args) {
        System.out.print("type integer = ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int sum = 0;
        int multiplication = 1;
        while (number % 10 != 0){
            sum = sum + number % 10;
            multiplication = multiplication * (number % 10);
            number = number / 10;
        }
        System.out.println("sum = " + sum + "\nmultiplication = " + multiplication);
        scanner.close();
    }
}
