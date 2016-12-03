package zadach.po.programmirovaniyu.partOne.Begin;

import java.util.Scanner;

/**
 * Created by Elvis on 03.12.2016.
 */

/*Дано значение угла α в радианах (0 < α < 2·π). Определить значение
этого же угла в градусах, учитывая, что 180° = π радианов. В качестве значения π использовать 3.14.*/

public class Begin30 {
    public static void main(String[] args) {
        System.out.print("type radian from 0 to 2π = ");
        Scanner scanner = new Scanner(System.in);
        double radian = scanner.nextDouble();
        if (radian >= 0 && radian <= 2 * Math.PI) {
            double angel = radian * 180 / Math.PI;
            System.out.println(angel);
        } else
            System.out.println("invalid data");
        scanner.close();
    }
}
