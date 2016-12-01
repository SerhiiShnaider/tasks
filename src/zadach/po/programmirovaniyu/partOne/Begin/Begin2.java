package zadach.po.programmirovaniyu.partOne.Begin;

import java.util.Scanner;

/**
 * Created by Elvis on 01.12.2016.
 */

/*Дана сторона квадрата a. Найти его площадь S = a2*/
public class Begin2 {
    public static void main(String[] args) {
        System.out.print("type number = ");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int s = (int) Math.pow(a, 2);
        System.out.println("result = " + s);
        scanner.close();
    }
}
