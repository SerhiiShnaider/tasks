package zadach.po.programmirovaniyu.partOne.If;

import java.util.Scanner;

/**
 * Created by Elvis on 06.12.2016.
 */

/*Дано целое число. Если оно является положительным, то
прибавить к нему 1; если отрицательным, то вычесть из него 2;
если нулевым, то заменить его на 10. Вывести полученное число.*/

public class If3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("type integer number = ");
        int number = scanner.nextInt();
        if (number > 0)
            System.out.print("number = " + (number + 1));
        else if(number < 0)
            System.out.print("number = " + (number - 2));
        else
            System.out.print("number = " + (number + 10));
    }
}
