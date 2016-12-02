package zadach.po.programmirovaniyu.partOne.Begin;

import java.util.Scanner;

/**
 * Created by Elvis on 02.12.2016.
 */

/*Найти расстояние между двумя точками с заданными координатами
(x1, y1) и (x2, y2) на плоскости. Расстояние вычисляется по формуле*/

public class Begin20 {
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
        double distance = Math.sqrt(Math.pow((Math.abs(x2) - Math.abs(x1)), 2) + Math.pow((Math.abs(y2) - Math.abs(y1)), 2));
        System.out.println("distance = " + distance);
    }
}
