package zadach.po.programmirovaniyu.partOne.Begin;

import java.util.Scanner;

/**
 * Created by Elvis on 01.12.2016.
 */


/*Даны два ненулевых числа. Найти сумму, разность, произведение и частное их модулей.*/

public class Begin11 {
    public static void main(String[] args) {
        System.out.print("type a = ");
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        System.out.print("type b = ");
        double b = scanner.nextDouble();
        if (a != 0 && b != 0) {
            double sum = Math.abs(a) + Math.abs(b);;
            double difference = Math.abs(a) - Math.abs(b);
            double multiplication = Math.abs(a) * Math.abs(b);;
            double division = Math.abs(a) / Math.abs(b);
            System.out.println("sum = " + sum);
            System.out.println("difference = " + difference);
            System.out.println("multiplication = " + multiplication);
            System.out.println("division = " + division);
        }else
            System.out.println("invalid data");
        scanner.close();
    }
}
