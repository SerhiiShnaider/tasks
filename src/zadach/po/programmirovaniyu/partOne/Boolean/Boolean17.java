package zadach.po.programmirovaniyu.partOne.Boolean;

import java.util.Scanner;

/**
 * Created by Elvis on 05.12.2016.
 */

/*Дано целое положительное число. Проверить истинность
высказывания: «Данное число является нечетным трехзначным».*/

public class Boolean17 {
    public static void main(String[] args) {
        System.out.print("type integer number = ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int counter = 0;
        int tmp = number;
        while ((tmp % 10) != 0){
            counter++;
            tmp /= 10;
        }
        if(counter == 3 && (number % 2 != 0))
            System.out.print("number is odd and three digits");
        else
            System.out.println("the condition is not fulfilled");
        scanner.close();
    }
}
