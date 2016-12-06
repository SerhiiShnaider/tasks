package zadach.po.programmirovaniyu.partOne.If;

import java.util.Scanner;

/**
 * Created by Elvis on 06.12.2016.
 */

/* Даны два числа. Вывести порядковый номер меньшего из них.*/

public class If7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("type integer number = ");
        int a = scanner.nextInt();
        System.out.print("type integer number = ");
        int b = scanner.nextInt();
        if(a < b)
            System.out.print("first number is less = " + a);
        else
            System.out.print("second number is less = " + b);
    }
}
