package zadach.po.programmirovaniyu.partOne.If;

import java.util.Scanner;

/**
 * Created by Elvis on 07.12.2016.
 */

/*Дано целое число. Вывести его строку-описание
вида «отрицательное четное число», «нулевое число»,
«положительное нечетное число» и т. д.*/

public class If29 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("type integer number = ");
        int number = scanner.nextInt();
        if (number == 0)
            System.out.print("number is null ");
        else if (number > 0)
            System.out.print("positive ");
        else
            System.out.print("negative ");


        if (number != 0 && number % 2 == 0)
            System.out.print("even number");
        else if (number != 0 && number % 2 != 0)
            System.out.print("odd number");

    }
}
