package zadach.po.programmirovaniyu.partOne.Begin;

import java.util.Scanner;

/**
 * Created by Elvis on 01.12.2016.
 */


/*Найти длину окружности L и площадь круга S заданного радиуса R:
L = 2·π·R, S = π·R2.*/

public class Begin7 {
    public static void main(String[] args) {
        System.out.print("type radius = ");
        Scanner scanner = new Scanner(System.in);
        double radius = scanner.nextDouble();
        double l = 2 * Math.PI * radius;
        double s = Math.PI * Math.pow(radius, 2);
        System.out.println("result: \n" + "circumference = " + l + "\narea = " + s);
        scanner.close();
    }
}
