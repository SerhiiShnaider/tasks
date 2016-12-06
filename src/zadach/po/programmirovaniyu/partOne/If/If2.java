package zadach.po.programmirovaniyu.partOne.If;

import java.util.Scanner;

/**
 * Created by Elvis on 06.12.2016.
 */

/*Дано целое число. Если оно является положительным, то прибавить
к нему 1; в противном случае вычесть из него 2. Вывести полученное число.*/

public class If2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("type integer number = ");
        int number = scanner.nextInt();
        if (number > 0)
            System.out.print("number = " + (number + 1));
        else
            System.out.print("number = " + (number - 2));
    }
}
