package zadach.po.programmirovaniyu.partOne.If;

import java.util.Scanner;

/**
 * Created by Elvis on 07.12.2016.
 */

/*Даны координаты точки, не лежащей на координатных осях OX и OY.
Определить номер координатной четверти, в которой находится данная
точка*/

public class If22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("type integer number x = ");
        int x = scanner.nextInt();
        System.out.print("type integer number y = ");
        int y = scanner.nextInt();
        if(x > 0 && y > 0)
            System.out.println("it is first quarter");
        else if (x < 0 && y >0)
            System.out.println("it is second quarter");
        else if(x < 0 && y < 0)
            System.out.println("it is third quarter");
        else if(x > 0 && y < 0)
            System.out.println("This fourth quarter");
    }
}
