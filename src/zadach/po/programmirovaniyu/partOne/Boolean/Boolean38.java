package zadach.po.programmirovaniyu.partOne.Boolean;

import java.util.Scanner;

/**
 * Created by Elvis on 06.12.2016.
 */

/*Даны координаты двух различных полей шахматной доски x1, y1,
x2, y2 (целые числа, лежащие в диапазоне 1–8). Проверить истинность
высказывания: «Слон за один ход может перейти с одного поля на другое»*/

public class Boolean38 {
    public static void main(String[] args) {
        System.out.print("type x1 (0 < x1 < 9) = ");
        Scanner scanner = new Scanner(System.in);
        int x1 = scanner.nextInt();
        System.out.print("type y1 ( 0 < y1 < 9) = ");
        int y1 = scanner.nextInt();
        System.out.print("type x2 ( 0 < x2 < 9) = ");
        int x2 = scanner.nextInt();
        System.out.print("type y2 ( 0 < y2 < 9) = ");
        int y2 = scanner.nextInt();
        if (1 <= x1 && x1 <= 8 && 1 <= y1 && y1 <= 8 && 1 <= x2 && x2 <= 8 && 1 <= y2 && y2 <= 8) {
            System.out.println("The bishop in a single move can move from one field to another? "
                    + (Math.abs(x1 - x2) == Math.abs(y1 - y2)));
        } else
            System.out.println("invalid data");

    }
}
