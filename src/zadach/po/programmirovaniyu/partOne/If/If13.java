package zadach.po.programmirovaniyu.partOne.If;

import java.util.Scanner;

/**
 * Created by Elvis on 07.12.2016.
 */

/*Даны три числа. Найти среднее из них (то есть
число, расположенное между наименьшим и наибольшим)*/

public class If13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("type integer number a = ");
        int a = scanner.nextInt();
        System.out.print("type integer number b = ");
        int b = scanner.nextInt();
        System.out.print("type integer number c = ");
        int c = scanner.nextInt();

        if(a < b && b < c)
            System.out.println(b);
        else if(b < a && a < c)
            System.out.println(a);
        else if(b < c && c < a)
            System.out.println(c);
        else
            System.out.println("all numbers is equal");
    }
}
