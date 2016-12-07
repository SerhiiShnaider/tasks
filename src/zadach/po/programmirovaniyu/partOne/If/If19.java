package zadach.po.programmirovaniyu.partOne.If;

import java.util.Scanner;

/**
 * Created by Elvis on 07.12.2016.
 */

/*Даны четыре целых числа, одно из которых отлично от трех других,
равных между собой. Определить порядковый номер числа, отличного от остальных.*/

public class If19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("type integer number a = ");
        int a = scanner.nextInt();
        System.out.print("type integer number b = ");
        int b = scanner.nextInt();
        System.out.print("type integer number c = ");
        int c = scanner.nextInt();
        System.out.print("type integer number d = ");
        int d = scanner.nextInt();

        if (a == b && a == d && a != c)
            System.out.println("3");
        else if (a == c && a == d && a != b)
            System.out.println("2");
        else if (b == c && b == d && b != a)
            System.out.println("1");
        else if(b == a && b == c && b != d)
            System.out.println("4");
        else
            System.out.println("all numbers is equal");
    }
}
