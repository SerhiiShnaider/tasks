package zadach.po.programmirovaniyu.partOne.Integer;

import java.util.Scanner;

/**
 * Created by Elvis on 04.12.2016.
 */

/*Дано двузначное число. Найти сумму и произведение его цифр.*/

public class Integer7 {
    public static void main(String[] args) {
        System.out.print("type integer = ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int leftNumber = number / 10;
        int rightNumber = number % 10;
        int sum = leftNumber + rightNumber;
        int multiplication = leftNumber * rightNumber;
        System.out.println("left sum = " + sum + "\nmultiplication = " + multiplication);
        scanner.close();
    }
}
