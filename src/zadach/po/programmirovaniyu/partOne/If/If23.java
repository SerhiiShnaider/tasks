package zadach.po.programmirovaniyu.partOne.If;

import java.util.Scanner;

/**
 * Created by Elvis on 07.12.2016.
 */

/*Даны целочисленные координаты трех вершин прямоугольника, стороны
которого параллельны координатным осям. Найти координаты его четвертой вершины.*/

public class If23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("type integer number x1 = ");
        int x1 = scanner.nextInt();
        System.out.print("type integer number y1 = ");
        int y1 = scanner.nextInt();
        System.out.print("type integer number x2 = ");
        int x2 = scanner.nextInt();
        System.out.print("type integer number y2 = ");
        int y2 = scanner.nextInt();
        System.out.print("type integer number x3 = ");
        int x3 = scanner.nextInt();
        System.out.print("type integer number y3 = ");
        int y3 = scanner.nextInt();
        int x4 = 0;
        int y4 = 0;
        if (x1 == x2)
            x4 = x3;
        else if (x1 == x3)
            x4 = x2;
        else if (x2 == x3)
            x4 = x1;

        if (y1 == y2)
            y4 = y3;
        else if (y1 == y3)
            y4 = y2;
        else if (y2 == y3)
            y4 = y1;

        System.out.println("x4 = " + x4 + "\ny4 = " + y4);

    }
}
