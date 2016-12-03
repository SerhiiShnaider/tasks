package zadach.po.programmirovaniyu.partOne.Begin;

import java.util.Scanner;

/**
 * Created by Elvis on 03.12.2016.
 */

/*Даны переменные A, B, C. Изменить их значения, переместив содержимое A в C,
C — в B, B — в A, и вывести новые значения переменных A, B, C.*/

public class Begin24 {
    public static void main(String[] args) {
        System.out.print("type a = ");
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        System.out.print("type b = ");
        double b = scanner.nextDouble();
        System.out.print("type c = ");
        double c = scanner.nextDouble();

        a = a + c;
        c = a - c;
        a = a - c;

        b = b + c;
        c = b - c;
        b = b - c;

        b = b + a;
        a = b - a;
        b = b - a;

        System.out.println("\na = " + a + "\nb = " + b + "\nc = " + c);
        scanner.close();
    }
}
