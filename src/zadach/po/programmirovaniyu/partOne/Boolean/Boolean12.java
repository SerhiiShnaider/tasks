package zadach.po.programmirovaniyu.partOne.Boolean;

import java.util.Scanner;

/**
 * Created by Elvis on 05.12.2016.
 */

/*Даны три целых числа: A, B, C. Проверить
истинность высказывания: «Каждое из чисел A, B, C положительное».*/

public class Boolean12 {
    public static void main(String[] args) {
        System.out.print("type integer a = ");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        System.out.print("type integer b = ");
        int b = scanner.nextInt();
        System.out.print("type integer c = ");
        int c = scanner.nextInt();
        System.out.println("all number are positive ? " + (a > 0 && b > 0 && c > 0));
        scanner.close();
    }
}
