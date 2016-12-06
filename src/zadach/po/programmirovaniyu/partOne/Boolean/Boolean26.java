package zadach.po.programmirovaniyu.partOne.Boolean;

import java.util.Scanner;

/**
 * Created by Elvis on 06.12.2016.
 */

/*Даны числа x, y. Проверить истинность высказывания:
«Точка с координатами (x, y) лежит в четвертой координатной четверти».*/

public class Boolean26 {
    public static void main(String[] args) {
        System.out.print("type integer x = ");
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        System.out.print("type integer y = ");
        int y = scanner.nextInt();
        System.out.println("is point in the fourth coordinate quarter ? "
                + ((x > 0) && (y < 0)));
        scanner.close();
    }
}
