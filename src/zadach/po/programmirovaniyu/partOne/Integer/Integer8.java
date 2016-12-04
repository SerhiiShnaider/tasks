package zadach.po.programmirovaniyu.partOne.Integer;

import java.util.Scanner;

/**
 * Created by Elvis on 04.12.2016.
 */

/*Дано двузначное число. Вывести число, полученное
при перестановке цифр исходного числа.*/

public class Integer8 {
    public static void main(String[] args) {
        System.out.print("type integer = ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int leftNumber = number / 10;
        int rightNumber = number % 10;
        String invertNumber = "" + rightNumber + leftNumber;
        System.out.println("new number = " + invertNumber);
        scanner.close();
    }
}
