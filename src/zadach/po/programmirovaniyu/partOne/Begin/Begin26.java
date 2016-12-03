package zadach.po.programmirovaniyu.partOne.Begin;

import java.util.Scanner;

/**
 * Created by Elvis on 03.12.2016.
 */

/*Найти значение функции y = 4·(x–3)6 – 7·(x–3)3 + 2 при данном значении x.*/

public class Begin26 {
    public static void main(String[] args) {
        System.out.print("type x = ");
        Scanner scanner = new Scanner(System.in);
        double x = scanner.nextDouble();
        double result = (4 * Math.pow((x - 3), 6) - (7 * Math.pow((x - 3), 3)) + 2);
        System.out.println("result = " + result);
        scanner.close();
    }
}
