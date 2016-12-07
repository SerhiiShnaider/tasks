package zadach.po.programmirovaniyu.partOne.If;

import java.util.Scanner;

/**
 * Created by Elvis on 07.12.2016.
 */

/*Для данного вещественного x найти значение следующей функции f, принимающей вещественные значения:
2·sin(x), если x > 0,
f(x) = 6 – x, если x ≤ 0.*/

public class If24 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("type integer number x = ");
        int x = scanner.nextInt();
        if (x > 0)
            System.out.println("f = " + (2 * Math.sin(x)));
        else
            System.out.println("f = " + (6 - x));
    }
}
