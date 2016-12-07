package zadach.po.programmirovaniyu.partOne.If;

import java.util.Scanner;

/**
 * Created by Elvis on 07.12.2016.
 */

/*Для данного целого x найти значение следующей функции f, принимающей значения целого типа:
2·x, если x < –2 или x > 2,
f(x) = –3·x, в противном случае.*/

public class If25 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("type integer number x = ");
        int x = scanner.nextInt();
        if (x < -2 || x > 2)
            System.out.println("f = " + (2 * x));
        else
            System.out.println("f = " + (-3 * x));
    }
}
