package zadach.po.programmirovaniyu.partOne.If;

import java.util.Scanner;

/**
 * Created by Elvis on 06.12.2016.
 */

/*Даны два числа. Вывести вначале большее, а затем меньшее из них*/

public class If8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("type integer number = ");
        int a = scanner.nextInt();
        System.out.print("type integer number = ");
        int b = scanner.nextInt();
        if(a < b) {
            System.out.print("bigger number = " + b);
            System.out.print("\nless number = " + a);
        }else{
            System.out.print("bigger number = " + a);
            System.out.print("\nless number = " + b);
        }
    }
}
