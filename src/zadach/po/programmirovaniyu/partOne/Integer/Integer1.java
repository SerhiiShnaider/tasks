package zadach.po.programmirovaniyu.partOne.Integer;

import java.util.Scanner;

/**
 * Created by Elvis on 04.12.2016.
 */

/*Дано расстояние L в сантиметрах. Используя операцию
деления нацело, найти количество полных метров в нем */

public class Integer1 {
    public static void main(String[] args) {
        System.out.print("type length in mm = ");
        Scanner scanner = new Scanner(System.in);
        int millimeters = scanner.nextInt();
        double meters =(double) millimeters / 100;
        System.out.println("length in meters = " + meters);
        scanner.close();
    }
}
