package zadach.po.programmirovaniyu.partOne.Begin;

import java.util.Scanner;

/**
 * Created by Elvis on 02.12.2016.
 */

/*Даны три точки A, B, C на числовой оси. Найти длины отрезков AC
и BC и их сумму.*/

public class Begin17 {
    public static void main(String[] args) {
        System.out.print("type point a = ");
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        System.out.print("type point b = ");
        double b = scanner.nextDouble();
        System.out.print("type point c = ");
        double c = scanner.nextDouble();
        double lengthAC = Math.abs(c - a);
        double lengthBC = Math.abs(c - b);
        double sum = lengthAC + lengthBC;
        System.out.println("length AC = " + lengthAC + "\nlength BC = "
                + lengthBC + "\nAC + BC = " + sum);
        scanner.close();
    }

}
