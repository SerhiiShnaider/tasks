package zadach.po.programmirovaniyu.partOne.Integer;

import java.util.Scanner;

/**
 * Created by Elvis on 04.12.2016.
 */

/*Дано трехзначное число. Вывести число, полученное при прочтении
исходного числа справа налево.*/

public class Integer12 {
    public static void main(String[] args) {
        System.out.print("type integer = ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        String inverseNumber ="";
        while (number % 10 != 0){
            inverseNumber += number % 10;
            number = number / 10;
        }
        System.out.println("inverse number = " + inverseNumber);
        scanner.close();
    }
}
