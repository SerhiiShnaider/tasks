package zadach.po.programmirovaniyu.partOne.Begin;

import java.util.Scanner;

/**
 * Created by Elvis on 03.12.2016.
 */

/* Найти решение системы линейных уравнений вида
A1·x + B1·y = C1,
A2·x + B2·y = C2,
заданной своими коэффициентами A1, B1, C1, A2, B2, C2, если известно, что
данная система имеет единственное решение. Воспользоваться формулами
x = (C1·B2 – C2·B1)/D, y = (A1·C2 – A2·C1)/D,
где D = A1·B2 – A2·B1*/

public class Begin40 {
    public static void main(String[] args) {
        System.out.print("type a1 = ");
        Scanner scanner = new Scanner(System.in);
        double a1 = scanner.nextDouble();

        System.out.print("type b1 = ");
        double b1 = scanner.nextDouble();

        System.out.print("type c1 = ");
        double c1 = scanner.nextDouble();

        System.out.print("type a2 = ");
        double a2 = scanner.nextDouble();

        System.out.print("type b2 = ");
        double b2 = scanner.nextDouble();

        System.out.print("type c2 = ");
        double c2 = scanner.nextDouble();

        double d = a1 * b2 - a2 * b1;
        double x = (c1 * b2 - c2 * b1) / d;
        double y = (a1 * c2 - a2 *c1) / d;

        System.out.println("x = " + x + "\ny = " + y);
    }
}
