package zadach.po.programmirovaniyu.partOne.If;

import java.util.Scanner;

/**
 * Created by Elvis on 06.12.2016.
 */

/*Даны три целых числа. Найти количество положительных
и количество отрицательных чисел в исходном наборе.*/

public class If5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("type integer number = ");
        int a = scanner.nextInt();
        System.out.print("type integer number = ");
        int b = scanner.nextInt();
        System.out.print("type integer number = ");
        int c = scanner.nextInt();
        int countPositive = 0;
        int countNegative = 0;

        if (a > 0)
            countPositive++;
        else
            countNegative++;
        if (b > 0)
            countPositive++;
        else
            countNegative++;
        if (c > 0)
            countPositive++;
        else
            countNegative++;

        System.out.println("positive numbers are " + countPositive
                + "\nnegative numbers are " + countNegative);
    }
}
