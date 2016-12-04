package zadach.po.programmirovaniyu.partOne.Integer;

import java.util.Scanner;

/**
 * Created by Elvis on 04.12.2016.
 */

/* Даны целые положительные числа A, B, C. На прямоугольнике размера
A × B размещено максимально возможное количество квадратов со
стороной C (без наложений). Найти количество квадратов, размещенных
на прямоугольнике, а также площадь незанятой части прямоугольника.*/

public class Integer29 {
    public static void main(String[] args) {
        System.out.print("type a = ");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        System.out.print("type b = ");
        int b = scanner.nextInt();
        System.out.print("type c = ");
        int c = scanner.nextInt();
        if (a > 0 && b > 0 && c > 0) {
            int squareRectangle = a * b;
            int squareQuadrate = c *c;
            int occupiedArea = squareRectangle / squareQuadrate;
            int freeArea = squareRectangle % squareQuadrate;
            System.out.println("count of quadrate in rectangle is " + occupiedArea
                    + "\nfree area in rectangle is " + freeArea);
        } else
            System.out.println("invalid data");
        scanner.close();
    }
}
