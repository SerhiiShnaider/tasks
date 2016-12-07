package zadach.po.programmirovaniyu.partOne.If;

import java.util.Scanner;

/**
 * Created by Elvis on 07.12.2016.
 */

/*Для данного вещественного x найти значение следующей функции f, принимающей вещественные значения:
–x, если x ≤ 0,
f(x) = x2, если 0 < x < 2,
4, если x ≥ 2*/

public class If26 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("type integer number x = ");
        double x = scanner.nextDouble();
        if (x <= 0)
            System.out.println("f = " + (-x));
        else if(0 < x && x < 2)
            System.out.println("f = " + (x * x));
        else
            System.out.println("f = " + 4);
    }
}
