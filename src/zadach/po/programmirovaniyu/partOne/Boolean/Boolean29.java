package zadach.po.programmirovaniyu.partOne.Boolean;

import java.util.Scanner;

/**
 * Created by Elvis on 06.12.2016.
 */

/*Даны числа x, y, x1, y1, x2, y2. Проверить истинность высказывания:
«Точка с координатами (x, y) лежит внутри прямоугольника, левая верхняя
вершина которого имеет координаты (x1, y1), правая нижняя — (x2, y2),
а стороны параллельны координатным осям».*/

public class Boolean29 {
    public static void main(String[] args) {
        System.out.print("type integer x = ");
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        System.out.print("type integer y = ");
        int y = scanner.nextInt();
        System.out.print("type integer x1 = ");
        int x1 = scanner.nextInt();
        System.out.print("type integer y1 = ");
        int y1 = scanner.nextInt();
        System.out.print("type integer x2 = ");
        int x2 = scanner.nextInt();
        System.out.print("type integer y2 = ");
        int y2 = scanner.nextInt();
        System.out.print("The point with coordinates (x, y) is inside the rectangle? " +
                        ((Math.abs(x1) <= Math.abs(x) && Math.abs(x) <= Math.abs(x2))
                        && (Math.abs(y1) <= Math.abs(y) && Math.abs(y) <= Math.abs(y2))));
        scanner.close();


    }
}
