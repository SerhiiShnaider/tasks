package zadach.po.programmirovaniyu.partOne.Begin;

import java.util.Scanner;

/**
 * Created by Elvis on 01.12.2016.
 */


/*Даны стороны прямоугольника a и b. Найти его площадь S = a·b и периметр P = 2·(a + b)*/
public class Begin3 {
    public static void main(String[] args) {
        System.out.print("type number  a = ");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        System.out.print("type number  b = ");
        int b = scanner.nextInt();
        int s = a * b;
        int p = 2 *(a + b);
        System.out.println("result: \n" +"area = "+ s+"\nperimeter = "+p);
        scanner.close();
    }
}
