package zadach.po.programmirovaniyu.partOne.Begin;

import java.util.Scanner;

/**
 * Created by Elvis on 02.12.2016.
 */

/*Поменять местами содержимое переменных A и B и вывести новые
значения A и B.*/
public class Begin22 {
    public static void main(String[] args) {
        System.out.print("type a = ");
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        System.out.print("type b = ");
        double b = scanner.nextDouble();
        double tmp = 0;
        // first way
        tmp = a;
        a = b;
        b = tmp;
        System.out.println("a = " + a + "\nb = " + b);
        // second way
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("\na = " + a + "\nb = " + b);
        scanner.close();
    }
}
