package zadach.po.programmirovaniyu.partOne.Boolean;

import java.util.Scanner;

/**
 * Created by Elvis on 06.12.2016.
 */

/*Даны целые числа a, b, c, являющиеся сторонами некоторого треугольника.
Проверить истинность высказывания: «Треугольник со сторонами a, b, c является равнобедренным».*/

public class Boolean31 {
    public static void main(String[] args) {
        System.out.print("type integer a = ");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        System.out.print("type integer b = ");
        int b = scanner.nextInt();
        System.out.print("type integer c = ");
        int c = scanner.nextInt();
        if (a != 0) {
            double d = Math.pow(b, 2) - 4 * a * c;
            double x1 = (-b + Math.sqrt(d)) / 2 * a;
            double x2 = (-b - Math.sqrt(d)) / 2 * a;
            System.out.println("is triangle isosceles ? " +
                    (a == b || b == c || c == a));
        }else
            System.out.println("invalid data");
        scanner.close();
    }
}
