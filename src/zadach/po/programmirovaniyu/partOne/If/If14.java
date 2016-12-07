package zadach.po.programmirovaniyu.partOne.If;

import java.util.Scanner;

/**
 * Created by Elvis on 07.12.2016.
 */

/*Даны три числа. Вывести вначале наименьшее,
а затем наибольшее из данных чисел.*/

public class If14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("type integer number a = ");
        int a = scanner.nextInt();
        System.out.print("type integer number b = ");
        int b = scanner.nextInt();
        System.out.print("type integer number c = ");
        int c = scanner.nextInt();

        if(a < b && a < c)
            System.out.println("min = " + a);
        else if(b < a && b < c)
            System.out.println("min = " + b);
        else if(c < b && c < a)
            System.out.println("min = " + c);
        else
            System.out.println("all numbers is equal");

        if(a < c && b < c)
            System.out.println("\nmax = " + c);
        else if(b < a && c < a)
            System.out.println("\nmax = " + a);
        else if(c < b && a < b)
            System.out.println("\nmax = " + b);
        else
            System.out.println("all numbers is equal");

    }
}
