package zadach.po.programmirovaniyu.partOne.Boolean;

import java.util.Scanner;

/**
 * Created by Elvis on 04.12.2016.
 */

/*Даны три целых числа: A, B, C. Проверить истинность
 высказывания: «Число B находится между числами A и C».*/

public class Boolean7 {
    public static void main(String[] args) {
        System.out.print("type a = ");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        System.out.print("type b = ");
        int b = scanner.nextInt();
        System.out.print("type c = ");
        int c = scanner.nextInt();
        System.out.println("is b between a and c ? " + (a < b && b < c));
        scanner.close();
    }
}
