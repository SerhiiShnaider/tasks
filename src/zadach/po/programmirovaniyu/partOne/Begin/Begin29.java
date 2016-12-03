package zadach.po.programmirovaniyu.partOne.Begin;

import java.util.Scanner;

/**
 * Created by Elvis on 03.12.2016.
 */

/*Дано значение угла α в градусах (0 < α < 360). Определить значение
этого же угла в радианах, учитывая, что 180° = π радианов.
В качестве значения π использовать 3.14.*/

public class Begin29 {
    public static void main(String[] args) {
        System.out.print("type angle from 0 to 360 = ");
        Scanner scanner = new Scanner(System.in);
        double angle = scanner.nextDouble();
        if (angle >= 0 && angle <= 360) {
            double radian = angle * Math.PI / 180;
            System.out.println(radian);
        } else
            System.out.println("invalid data");
        scanner.close();
    }
}
