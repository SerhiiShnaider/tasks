package zadach.po.programmirovaniyu.partOne.Begin;

import java.util.Scanner;

/**
 * Created by Elvis on 03.12.2016.
 */

/*Решить линейное уравнение A·x + B = 0, заданное
своими коэффициентами A и B (коэффициент A не равен 0)*/

public class Begin38 {
    public static void main(String[] args) {
        System.out.print("type a = ");
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        System.out.print("type b = ");
        double b = scanner.nextDouble();
        double x;
        if (a != 0) {
            x = -b / a;
            System.out.println("x = " + x);
        } else
            System.out.println("invalid data");
        scanner.close();
    }
}
