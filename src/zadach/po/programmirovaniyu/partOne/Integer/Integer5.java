package zadach.po.programmirovaniyu.partOne.Integer;

import java.util.Scanner;

/**
 * Created by Elvis on 04.12.2016.
 */

/*Даны целые положительные числа A и B (A > B). На отрезке длины A
размещено максимально возможное количество отрезков длины B (без наложений).
Используя операцию взятия остатка от деления нацело, найти
длину незанятой части отрезка A.*/

public class Integer5 {
    public static void main(String[] args) {
        System.out.print("type a = ");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        System.out.print("type b = ");
        int b = scanner.nextInt();
        if(a > b){
            int freeInA = a % b;
            System.out.println("free space on the segment A = " + freeInA);
        }else
            System.out.println("invalid data");
        scanner.close();
    }
}
