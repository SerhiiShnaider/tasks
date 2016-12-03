package zadach.po.programmirovaniyu.partOne.Begin;

import java.util.Scanner;

/**
 * Created by Elvis on 03.12.2016.
 */

/*Найти корни квадратного уравнения A·x2 + B·x + C = 0, заданного
своими коэффициентами A, B, C (коэффициент A не равен 0), если известно,
что дискриминант уравнения положителен. Вывести вначале меньший,
а затем больший из найденных корней. Корни квадратного уравнения находятся
по формуле x1,2 = ( ) − ± B D / (2·A), где D — дискриминант, равный B2 – 4·A·C.*/
public class Begin39 {
    public static void main(String[] args) {
        System.out.print("type a = ");
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();

        System.out.print("type b = ");
        double b = scanner.nextDouble();

        System.out.print("type c = ");
        double c = scanner.nextDouble();

        if (a != 0) {
            double discriminant = Math.pow(b, 2) - 4 * a * c;
            double x1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double x2 = (-b - Math.sqrt(discriminant)) / (2 * a);
            System.out.println("x1 = " + x1 + "\nx2 = " + x2);
        } else
            System.out.println("invalid data");
    }
}
