package zadach.po.programmirovaniyu.partOne.Boolean;

import java.util.Scanner;

/**
 * Created by Elvis on 04.12.2016.
 */

/*Даны два целых числа: A, B. Проверить истинность высказывания:
«Справедливы неравенства A ≥ 0 или B < –2».*/

public class Boolean5 {
    public static void main(String[] args) {
        System.out.print("type a = ");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        System.out.print("type b = ");
        int b = scanner.nextInt();
        System.out.println("is true:  A >= 0 и B < -0 ? " + (a >= 0 && b < -2));
        scanner.close();
    }
}
