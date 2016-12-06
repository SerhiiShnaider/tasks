package zadach.po.programmirovaniyu.partOne.If;

import java.util.Scanner;

/**
 * Created by Elvis on 06.12.2016.
 */

/*Дано целое число. Если оно является положительным, то прибавить к
нему 1; в противном случае не изменять его. Вывести полученное число.*/

public class If1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("type integer number = ");
        int number = scanner.nextInt();
        if(number > 0){
            number += 1;
            System.out.print("number = " + number);
        }else
            System.out.print("number = " + number);
    }
}
