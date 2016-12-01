package zadach.po.programmirovaniyu.partOne.Begin;

import java.util.Scanner;

/**
 * Created by Elvis on 01.12.2016.
 */

/*Даны катеты прямоугольного треугольника a и b. Найти его гипотенузу c и периметр P:
c = 2a + b2 , P = a + b + c.*/
public class Begin12 {
    public static void main(String[] args) {
        System.out.print("type a = ");
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        System.out.print("type b = ");
        double b = scanner.nextDouble();
        if (a > 0 && b > 0) {
            double c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
            double perimeter = a + b + c;
            System.out.println("c = " + c + "\nperimeter = " + perimeter);
        } else
            System.out.println("invalid data");
        scanner.close();
    }
}
