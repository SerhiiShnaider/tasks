package zadach.po.programmirovaniyu.partOne.Boolean;

import java.util.Scanner;

/**
 * Created by Elvis on 04.12.2016.
 */

/*Даны два целых числа: A, B. Проверить истинность высказывания:
«Каждое из чисел A и B нечетное»*/

public class Boolean8 {
    public static void main(String[] args) {
        System.out.print("type a = ");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        System.out.print("type b = ");
        int b = scanner.nextInt();
        System.out.println("is a and b odd ? " + ((a % 2 != 0) && (b % 2 !=0)));
        scanner.close();
    }
}
