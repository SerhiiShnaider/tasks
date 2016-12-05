package zadach.po.programmirovaniyu.partOne.Boolean;

import java.util.Scanner;

/**
 * Created by Elvis on 05.12.2016.
 */

/*Проверить истинность высказывания: «Среди трех данных целых
чисел есть хотя бы одна пара взаимно противоположных».*/

public class Boolean19 {
    public static void main(String[] args) {
        System.out.print("type integer a = ");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        System.out.print("type integer b = ");
        int b = scanner.nextInt();
        System.out.print("type integer c = ");
        int c = scanner.nextInt();
        System.out.println("Among three integer numbers have" +
                " at least one pair of mutually opposite ? "
                + (a == -b || a == -c || b == -c));
        scanner.close();
    }
}
