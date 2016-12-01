package zadach.po.programmirovaniyu.partOne.Begin;

import java.util.Scanner;

/**
 * Created by Elvis on 01.12.2016.
 */

/*Дана сторона квадрата a. Найти его периметр P = 4·a*/
public class Begin1 {
    public static void main(String[] args) {
        System.out.print("type number = ");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int p = 4 * a;
        System.out.println("result = " + p);
        scanner.close();
    }
}
