package zadach.po.programmirovaniyu.partOne.Boolean;

import java.util.Scanner;

/**
 * Created by Elvis on 06.12.2016.
 */

/*Даны числа x, y. Проверить истинность высказывания: «Точка с
координатами (x, y) лежит во второй или третьей координатной четверти».*/

public class Boolean27 {
    public static void main(String[] args) {
        System.out.print("type integer x = ");
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        System.out.print("type integer y = ");
        int y = scanner.nextInt();
        System.out.println("is point in second or in the third coordinate quarter ? "
                + (((x < 0) && (y > 0)) || ((x < 0) && (y < 0))));
        scanner.close();
    }
}
