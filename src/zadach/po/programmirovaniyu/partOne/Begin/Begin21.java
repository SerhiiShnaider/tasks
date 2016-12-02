package zadach.po.programmirovaniyu.partOne.Begin;

import java.util.Scanner;

/**
 * Created by Elvis on 02.12.2016.
 */

/*Даны координаты трех вершин треугольника: (x1, y1), (x2, y2), (x3, y3).
Найти его периметр и площадь, используя формулу для расстояния между
двумя точками на плоскости (см. задание Begin20). Для нахождения площади
треугольника со сторонами a, b, c использовать формулу Герона:
S = p ⋅ ( p − a) ⋅ ( p − b) ⋅ ( p − c),
где p = (a + b + c)/2 — полупериметр.*/

public class Begin21 {
    public static void main(String[] args) {
        System.out.print("type point x1 = ");
        Scanner scanner = new Scanner(System.in);
        double x1 = scanner.nextDouble();
        System.out.print("type point y1 = ");
        double y1 = scanner.nextDouble();
        System.out.print("type point x2 = ");
        double x2 = scanner.nextDouble();
        System.out.print("type point y2 = ");
        double y2 = scanner.nextDouble();
        System.out.print("type point x3 = ");
        double x3 = scanner.nextDouble();
        System.out.print("type point y3 = ");
        double y3 = scanner.nextDouble();
        double a = Math.sqrt(Math.pow((Math.abs(x2) - Math.abs(x1)), 2) + Math.pow((Math.abs(y2) - Math.abs(y1)), 2));
        double b = Math.sqrt(Math.pow((Math.abs(x3) - Math.abs(x1)), 2) + Math.pow((Math.abs(y3) - Math.abs(y1)), 2));
        double c = Math.sqrt(Math.pow((Math.abs(x3) - Math.abs(x2)), 2) + Math.pow((Math.abs(y3) - Math.abs(y2)), 2));
        double p = (a + b + c) / 2;
        double s = Math.sqrt(p * ( p - a) * (p - b) * (p - c));
        System.out.println("a " + a + "     b " + b + "   c " + c);
        System.out.println("square = " + s + "\nperimeter = " + p * 2);
        scanner.close();
    }
}
