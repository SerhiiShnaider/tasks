package zadach.po.programmirovaniyu.partOne.If;

import java.util.Scanner;

/**
 * Created by Elvis on 07.12.2016.
 */

/*Для данного вещественного x найти значение следующей функции f,
принимающей значения целого типа:
0, если x < 0,
f(x) = 1, если x принадлежит [0, 1), [2, 3), …,
–1, если x принадлежит [1, 2), [3, 4), … .*/

public class If27 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("type integer number x = ");
        double x = scanner.nextDouble();
        if (x < 0)
            System.out.println("f = " + 0);
        else if (x % 2 == 0)
            System.out.println("f = " + 1);
        else
            System.out.println("f = " + (-1));
    }
}
