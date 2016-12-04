package zadach.po.programmirovaniyu.partOne.Integer;

import java.util.Scanner;

/**
 * Created by Elvis on 04.12.2016.
 */

/*Даны целые положительные числа A и B (A > B). На отрезке
длины A размещено максимально возможное количество отрезков
длины B (без наложений). Используя операцию деления нацело,
найти количество отрезков B, размещенных на отрезке A.*/

public class Integer4 {
    public static void main(String[] args) {
        System.out.print("type a = ");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        System.out.print("type b = ");
        int b = scanner.nextInt();
        if(a > b){
            int maxBInA = a / b;
            System.out.println("number of segments B located on the segment A = " + maxBInA);
        }else
            System.out.println("invalid data");
        scanner.close();
    }
}
