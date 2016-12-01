package zadach.po.programmirovaniyu.partOne.Begin;

import java.util.Scanner;

/**
 * Created by Elvis on 01.12.2016.
 */
/*Даны два неотрицательных числа a и b. Найти их среднее геометрическое, то есть квадратный корень из их произведения: a ⋅b */

public class Begin9 {
    public static void main(String[] args) {
        System.out.print("type a = ");
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        System.out.print("type b = ");
        double b = scanner.nextDouble();
        if (a >= 0 && b >= 0) {
            double radical = Math.sqrt(a * b);
            System.out.println("radical = " + radical);
        }else
            System.out.println("invalid data");
        scanner.close();
    }
}
