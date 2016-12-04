package zadach.po.programmirovaniyu.partOne.Integer;

import java.util.Scanner;

/**
 * Created by Elvis on 04.12.2016.
 */

/*Дана масса M в килограммах. Используя операцию деления нацело,
найти количество полных тонн в ней (1 тонна = 1000 кг).*/

public class Integer2 {
    public static void main(String[] args) {
        System.out.print("type length in kg = ");
        Scanner scanner = new Scanner(System.in);
        int kilograms = scanner.nextInt();
        double tons =(double) kilograms / 1000;
        System.out.println("length in tons = " + tons);
        scanner.close();
    }
}
