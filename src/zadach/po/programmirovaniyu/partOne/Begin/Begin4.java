package zadach.po.programmirovaniyu.partOne.Begin;

import java.util.Scanner;

/**
 * Created by Elvis on 01.12.2016.
 */

/*Дан диаметр окружности d. Найти ее длину L = π·d. В качестве значения π использовать 3.14.*/
public class Begin4 {
    public static void main(String[] args) {
        System.out.print("type diameter = ");
        Scanner scanner = new Scanner(System.in);
        double diameter = scanner.nextDouble();
        double L = Math.PI * diameter;
        System.out.println("diameter:" + L);
        scanner.close();
    }
}
