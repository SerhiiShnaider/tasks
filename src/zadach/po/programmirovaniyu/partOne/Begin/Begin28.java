package zadach.po.programmirovaniyu.partOne.Begin;

import java.util.Scanner;

/**
 * Created by Elvis on 03.12.2016.
 */

/*Дано число A. Вычислить A15, используя две вспомогательные переменные
и пять операций умножения. Для этого последовательно находить
A2, A3, A5, A10, A15. Вывести все найденные степени числа A.*/

public class Begin28 {
    public static void main(String[] args) {
        System.out.print("type a = ");
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        double a2 = a * a;
        double a3 = a2 * a;
        double a5 = a3 * a2;
        double a10 = a5 * a5;
        double a15 = a10 * a5;
        System.out.println("a2 = " + a2 + "\na3 = " + a3 + "\na5 = " + a5
                + "\na10 = " + a10 + "\na15 = " + a15);
        scanner.close();
    }
}
