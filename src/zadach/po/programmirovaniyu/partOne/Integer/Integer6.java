package zadach.po.programmirovaniyu.partOne.Integer;

import java.util.Scanner;

/**
 * Created by Elvis on 04.12.2016.
 */

/*Дано двузначное число. Вывести вначале его левую цифру (десятки),
а затем — его правую цифру (единицы). Для нахождения десятков
использовать операцию деления нацело, для нахождения единиц —
операцию взятия остатка от деления.*/

public class Integer6 {
    public static void main(String[] args) {
        System.out.print("type integer = ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int leftNumber = number / 10;
        int rightNumber = number % 10;
        System.out.println("left number = " + leftNumber + "\nright number = " + rightNumber);
        scanner.close();
    }
}
