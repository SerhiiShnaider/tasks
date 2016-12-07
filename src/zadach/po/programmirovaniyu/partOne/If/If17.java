package zadach.po.programmirovaniyu.partOne.If;

import java.util.Scanner;

/**
 * Created by Elvis on 07.12.2016.
 */

/*Даны три переменные вещественного типа: A, B, C. Если их значения
упорядочены по возрастанию или убыванию, то удвоить их; в противном
случае заменить значение каждой переменной на противоположное.
Вывестиновые значения переменных A, B, C.*/

public class If17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("type integer number a = ");
        int a = scanner.nextInt();
        System.out.print("type integer number b = ");
        int b = scanner.nextInt();
        System.out.print("type integer number c = ");
        int c = scanner.nextInt();

        if (a < b && b < c) {
            a *= 2;
            b *= 2;
            c *= 2;
            System.out.println("a = " + a + "\nb = " + b + "\nc = " + c);
        } else if (a > b && b > c) {
            a *= 2;
            b *= 2;
            c *= 2;
            System.out.println("a = " + a + "\nb = " + b + "\nc = " + c);
        } else {
            System.out.println("a = " + (-a) + "\nb = " + (-b) + "\nc = " + (-c));
        }
    }
}
