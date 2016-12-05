package zadach.po.programmirovaniyu.partOne.Boolean;

import java.util.Scanner;

/**
 * Created by Elvis on 05.12.2016.
 */

/*Даны два целых числа: A, B. Проверить истинность высказывания:
«Числа A и B имеют одинаковую четность».*/

public class Boolean11 {
    public static void main(String[] args) {
        System.out.print("type integer a = ");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        System.out.print("type integer b = ");
        int b = scanner.nextInt();
        System.out.println("numbers have equal parity ? " + (((a % 2 == 0) && (b % 2 == 0)) ||
                ((a % 2 != 0) && (b % 2 != 0))));
        scanner.close();
    }
}
