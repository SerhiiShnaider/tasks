package zadach.po.programmirovaniyu.partOne.Boolean;

import java.util.Scanner;

/**
 * Created by Elvis on 06.12.2016.
 */

/*Дано четырехзначное число. Проверить истинность высказывания:
«Данное число читается одинаково слева направо и справа налево».
Boolean24. Даны числа A, B, C (число A не равно 0). Рассмотрев
дискриминант D = B2 – 4·A·C, проверить истинность высказывания:
«Квадратное уравнение A·x2 + B·x + C = 0 имеет вещественные корни».*/

public class Boolean24 {
    public static void main(String[] args) {
        System.out.print("type integer a (a > 0)= ");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        System.out.print("type integer b = ");
        int b = scanner.nextInt();
        System.out.print("type integer c = ");
        int c = scanner.nextInt();
        if (a != 0) {
            double d = Math.pow(b, 2) - 4 * a * c;
            double x1 = (-b + Math.sqrt(d)) / 2 * a;
            double x2 = (-b - Math.sqrt(d)) / 2 * a;
            System.out.println("The quadratic equation has real roots ? "
                    + (x1 >= 0 && x2 >=0));
        }else
            System.out.println("invalid data");
        scanner.close();
    }
}
