package zadach.po.programmirovaniyu.partOne.If;

import java.util.Scanner;

/**
 * Created by Elvis on 07.12.2016.
 */

/*Даны целочисленные координаты точки на плоскости. Если
точка совпадает с началом координат, то вывести 0. Если
точка не совпадает с началом координат, но лежит на оси
OX или OY, то вывести соответственно 1 или 2. Если точка
не лежит на координатных осях, то вывести 3.*/

public class If21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("type integer number x = ");
        int x = scanner.nextInt();
        System.out.print("type integer number y = ");
        int y = scanner.nextInt();
        if(x == 0 && y == 0)
            System.out.println("0");
        else if (x != 0 && y ==0)
            System.out.println("1");
        else if(x == 0 && y != 0)
            System.out.println("2");
        else
            System.out.println("3");
    }
}
