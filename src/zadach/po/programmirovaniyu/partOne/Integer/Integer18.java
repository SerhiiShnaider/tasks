package zadach.po.programmirovaniyu.partOne.Integer;

import java.util.Scanner;

/**
 * Created by Elvis on 04.12.2016.
 */

/*Дано целое число, большее 999. Используя одну операцию
деления нацело и одну операцию взятия остатка от деления,
найти цифру, соответствующую разряду тысяч в записи этого числа.*/

public class Integer18 {
    public static void main(String[] args) {
        System.out.print("type integer > 999 = ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        if (number > 999 && number <= 9999) {
            String newNumber = "" + ((number / 1000) % 10);
            System.out.println("thousands in number = " + newNumber);
        }else if(number > 9999 && number <= 99999){
            String newNumber = "" + ((number / 1000) % 100);
            System.out.println("thousands in number = " + newNumber);
        }else if(number > 99999 && number <= 999999){
            String newNumber = "" + ((number / 1000) % 1000);
            System.out.println("thousands in number = " + newNumber);
        }else {
            System.out.println("invalid data");
        }
        scanner.close();
    }
}
