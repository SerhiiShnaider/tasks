package zadach.po.programmirovaniyu.partOne.Begin;

import java.util.Scanner;

/**
 * Created by Elvis on 01.12.2016.
 */


/*Даны два числа a и b. Найти их среднее арифметическое: (a + b)/2*/

public class Begin8 {
    public static void main(String[] args) {
        System.out.print("type a = ");
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        System.out.print("type b = ");
        double b = scanner.nextDouble();
        double arithmeticMean = (a + b ) / 2;
        System.out.println("arithmetic mean = " +  arithmeticMean);
        scanner.close();
    }
}
