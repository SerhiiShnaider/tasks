package zadach.po.programmirovaniyu.partOne.Begin;

import java.util.Scanner;

/**
 * Created by Elvis on 01.12.2016.
 */


/*Найти расстояние между двумя точками с заданными координатами
x1 и x2 на числовой оси: |x2 – x1|.*/

public class Begin16 {
    public static void main(String[] args) {
        System.out.print("type x1 = ");
        Scanner scanner = new Scanner(System.in);
        double x1 = scanner.nextDouble();
        System.out.print("type x2 = ");
        double x2 = scanner.nextDouble();
        double distance = Math.abs(x2 - x1);
        System.out.println("distance = " + distance);
        scanner.close();
    }
}