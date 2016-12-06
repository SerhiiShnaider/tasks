package zadach.po.programmirovaniyu.partOne.Boolean;

import java.util.Scanner;

/**
 * Created by Elvis on 06.12.2016.
 */

/*Даны координаты двух различных полей шахматной доски x1, y1,
x2, y2 (целые числа, лежащие в диапазоне 1–8). Проверить истинность
высказывания: «Данные поля имеют одинаковый цвет».*/

public class Boolean35 {
    public static void main(String[] args) {
        System.out.print("type x (0 < x < 9) = ");
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        System.out.print("type y ( 0 < y < 9) = ");
        int y = scanner.nextInt();
        System.out.print("type y ( 0 < x1 < 9) = ");
        int x1 = scanner.nextInt();
        System.out.print("type y ( 0 < y1 < 9) = ");
        int y1 = scanner.nextInt();
        if (1 <= x && x <= 8 && 1 <= y && y <= 8 &&
                1 <= x1 && x1 <= 8 && 1 <= y1 && y1 <= 8){
            System.out.println("are fields  have one color ? " + (((x + y) % 2) == ((x1 + y1) % 2)));
        }else
            System.out.println("invalid data");

    }
}
