package zadach.po.programmirovaniyu.partOne.If;

import java.util.Scanner;

/**
 * Created by Elvis on 07.12.2016.
 */

/*На числовой оси расположены три точки: A, B, C.
Определить, какая из двух последних точек (B или C)
расположена ближе к A, и вывести эту точку и ее расстояние от точки A.*/

public class If20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("type integer number a = ");
        int a = scanner.nextInt();
        System.out.print("type integer number b = ");
        int b = scanner.nextInt();
        System.out.print("type integer number c = ");
        int c = scanner.nextInt();
        if(Math.abs(b - a) < Math.abs(c - a)){
            System.out.println("length from b to a is " + Math.abs(b - a));
        }else
            System.out.println("length from c to a is " + Math.abs(c - a));
    }
}
