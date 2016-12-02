package zadach.po.programmirovaniyu.partOne.Begin;

import java.util.Scanner;

/**
 * Created by Elvis on 02.12.2016.
 */

/*Даны координаты двух противоположных вершин прямоугольника:
(x1, y1), (x2, y2). Стороны прямоугольника параллельны осям координат.
Найти периметр и площадь данного прямоугольника.*/


public class Begin19 {
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
        double length = Math.abs(x2) - Math.abs(x1);
        double height = Math.abs(y2) - Math.abs(y1);
        double s = length * height;
        double perimeter = 2 * (length + height);
        System.out.println("square = " + s + "\nperimeter = " + perimeter);
        scanner.close();
    }
}
