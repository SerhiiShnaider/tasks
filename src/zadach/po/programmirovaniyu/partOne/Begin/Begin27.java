package zadach.po.programmirovaniyu.partOne.Begin;

import java.util.Scanner;

/**
 * Created by Elvis on 03.12.2016.
 */

/*Дано число A. Вычислить A8, используя вспомогательную переменную
и три операции умножения. Для этого последовательно находить A2,
A4, A8. Вывести все найденные степени числа A.*/

public class Begin27 {
    public static void main(String[] args) {
        System.out.print("type a = ");
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        double a2 = a * a;
        double a4 = a2 * a2;
        double a8 = a4 * a4;
        System.out.println("a2 = " + a2 + "\na4 = " + a4 + "\na8 = " + a8);
        scanner.close();
    }
}
