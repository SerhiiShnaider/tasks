package zadach.po.programmirovaniyu.partOne.If;

import java.util.Scanner;

/**
 * Created by Elvis on 07.12.2016.
 */

/*Дано целое число, лежащее в диапазоне 1–999. Вывести его строкуописание
вида «четное двузначное число», «нечетное трехзначное число»
и т. д.*/

public class If30 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("type integer number = ");
        int number = scanner.nextInt();
        if (number / 100 >= 1)
            System.out.print("three-digit ");
        else if(number / 10 >= 1)
            System.out.print("two-digit ");
        else
            System.out.println("one-digit number");
        if(number % 2 == 0)
            System.out.print("even number");
        else
            System.out.print("odd number");
    }
}
