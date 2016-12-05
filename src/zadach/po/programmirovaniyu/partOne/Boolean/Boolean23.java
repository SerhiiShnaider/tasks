package zadach.po.programmirovaniyu.partOne.Boolean;

import java.util.Scanner;

/**
 * Created by Elvis on 05.12.2016.
 */

/* Дано четырехзначное число. Проверить истинность высказывания:
«Данное число читается одинаково слева направо и справа налево».*/

public class Boolean23 {
    public static void main(String[] args) {
        System.out.print("type integer number = ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int tmp = number;
        String numberTemp = "";
        while (tmp % 10 !=0){
            numberTemp += tmp % 10;
            tmp /= 10;
        }
        int numberInvert = Integer.parseInt(numberTemp);
        System.out.println(numberTemp);
        System.out.println("is this number invert ? " + (number == numberInvert));
        scanner.close();

    }
}
