package zadach.po.programmirovaniyu.partOne.Boolean;

import java.util.Scanner;

/**
 * Created by Elvis on 05.12.2016.
 */

/*Дано трехзначное число. Проверить истинность высказывания:
«Цифры данного числа образуют возрастающую или убывающую последовательность».*/

public class Boolean22 {
    public static void main(String[] args) {
        System.out.print("type integer number = ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int a = number % 10;
        int b = (number / 10) % 10;
        int c = (number / 100) % 10;
        System.out.println("is figures of the number a increase or declining sequence ? "
                + ((c < b && b < a) || (a < b && b < c)));
        scanner.close();
    }
}
