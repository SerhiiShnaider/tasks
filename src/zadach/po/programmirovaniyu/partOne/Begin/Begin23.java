package zadach.po.programmirovaniyu.partOne.Begin;

import java.util.Scanner;

/**
 * Created by Elvis on 02.12.2016.
 */

/*Даны переменные A, B, C. Изменить их значения,
переместив содержимое A в B, B — в C, C — в A,
и вывести новые значения переменных A, B, C.*/
public class Begin23 {
    public static void main(String[] args) {
        System.out.print("type a = ");
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        System.out.print("type b = ");
        double b = scanner.nextDouble();
        System.out.print("type c = ");
        double c = scanner.nextDouble();

        a = a + b;
        b = a - b;
        a = a - b;

        b = b + c;
        c = b - c;
        b = b - c;

        c = c + a;
        a = c - a;
        c = c - a;

        System.out.println("\na = " + a + "\nb = " + b + "\nc = " + c);
        scanner.close();
    }
}
