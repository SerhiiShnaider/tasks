package zadach.po.programmirovaniyu.partOne.If;

import java.util.Scanner;

/**
 * Created by Elvis on 06.12.2016.
 */

/*Даны три целых числа. Найти количество
положительных чисел в исходном наборе.*/

public class If4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("type integer number = ");
        int a = scanner.nextInt();
        System.out.print("type integer number = ");
        int b = scanner.nextInt();
        System.out.print("type integer number = ");
        int c = scanner.nextInt();
        int count = 0;

        if (a > 0)
            count++;
        if (b > 0)
            count++;
        if (c > 0)
            count++;

        System.out.println("positive numbers are " + count);
    }
}
