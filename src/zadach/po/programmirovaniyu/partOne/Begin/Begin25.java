package zadach.po.programmirovaniyu.partOne.Begin;

import java.util.Scanner;

/**
 * Created by Elvis on 03.12.2016.
 */

/*Найти значение функции y = 3·x6 – 6·x2 – 7 при данном значении x.*/

public class Begin25 {
    public static void main(String[] args) {
        System.out.print("type x = ");
        Scanner scanner = new Scanner(System.in);
        double x = scanner.nextDouble();
        double result = (3 * Math.pow(x, 6)) - (6 * Math.pow(x, 2)) - 7;
        System.out.println("result = " + result);
        scanner.close();
    }
}
