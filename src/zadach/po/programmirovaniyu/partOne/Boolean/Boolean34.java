package zadach.po.programmirovaniyu.partOne.Boolean;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.Scanner;

/**
 * Created by Elvis on 06.12.2016.
 */

/*Даны координаты поля шахматной доски x, y (целые числа,
лежащие в диапазоне 1–8). Учитывая, что левое нижнее поле
доски (1, 1) является черным, проверить истинность высказывания:
«Данное поле является белым».*/

public class Boolean34 {
    public static void main(String[] args) {
        System.out.print("type x (0 < x < 9) = ");
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        System.out.print("type y ( 0 < y < 9) = ");
        int y = scanner.nextInt();
        if (1 <= x && x <= 8 && 1 <= y && y <= 8){
            System.out.println("is field  white ? " + ((x + y) % 2 != 0));
        }else
            System.out.println("invalid data");

    }
}
