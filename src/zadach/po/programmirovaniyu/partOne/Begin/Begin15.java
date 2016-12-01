package zadach.po.programmirovaniyu.partOne.Begin;

import java.util.Scanner;

/**
 * Created by Elvis on 01.12.2016.
 */

/*Дана площадь S круга. Найти его диаметр D и длину L окружности,
ограничивающей этот круг, учитывая, что L = π·D, S = π·D2/4. В качестве
значения π использовать 3.14.*/

public class Begin15 {
    public static void main(String[] args) {
        System.out.print("type s = ");
        Scanner scanner = new Scanner(System.in);
        double s = scanner.nextDouble();
        if (s > 0) {
            double d = Math.sqrt((4 * s) / Math.PI);
            double l = Math.PI * d;
            System.out.println("diameter = " + d + "\ncircumference = " + l);
        } else
            System.out.println("invalid data");
        scanner.close();
    }
}
