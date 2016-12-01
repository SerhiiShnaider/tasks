package zadach.po.programmirovaniyu.partOne.Begin;

import java.util.Scanner;

/**
 * Created by Elvis on 01.12.2016.
 */

/*Дана длина L окружности. Найти ее радиус R и площадь S круга, ограниченного этой окружностью,
учитывая, что L = 2·π·R, S = π·R2. В качестве значения π использовать 3.14.*/

public class Begin14 {
    public static void main(String[] args) {
        System.out.print("type l = ");
        Scanner scanner = new Scanner(System.in);
        double l = scanner.nextDouble();
        if (l > 0) {
            double r = l / (2 * Math.PI);
            double s = Math.PI * Math.pow(r, 2);
            System.out.println("radius = " + r + "\nsquare = " + s );
        } else
            System.out.println("invalid data");
        scanner.close();
    }
}
