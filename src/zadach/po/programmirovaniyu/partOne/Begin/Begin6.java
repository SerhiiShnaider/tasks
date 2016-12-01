package zadach.po.programmirovaniyu.partOne.Begin;

import java.util.Scanner;

/**
 * Created by Elvis on 01.12.2016.
 */


/*Даны длины ребер a, b, c прямоугольного параллелепипеда. Найти его
объем V = a·b·c и площадь поверхности S = 2·(a·b + b·c + a·c).*/

public class Begin6 {
    public static void main(String[] args) {
        System.out.print("type the length of the edges a = ");
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        System.out.print("type the length of the edges b = ");
        double b = scanner.nextDouble();
        System.out.print("type the length of the edges c = ");
        double c = scanner.nextDouble();
        double v = a * b * c;
        double s = 2 * ((a * b) + (b * c) + (a * c));
        System.out.println("result: \n" + "capacity = " + v + "\narea = " + s);
        scanner.close();
    }
}
