package zadach.po.programmirovaniyu.partOne.Boolean;

import java.util.Scanner;

/**
 * Created by Elvis on 04.12.2016.
 */

/*Дано целое число A. Проверить истинность высказывания: «Число A
является четным».*/

public class Boolean3 {
    public static void main(String[] args) {
        System.out.print("type a = ");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        System.out.println("is a even ? " + (a % 2 == 0));
        scanner.close();
    }
}
