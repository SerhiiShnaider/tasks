package zadach.po.programmirovaniyu.partOne.Begin;

import java.util.Scanner;

/*Дана длина ребра куба a. Найти объем куба V = a3 и площадь его поверхности S = 6·a2*/

public class Begin5 {
    public static void main(String[] args) {
        System.out.print("type the length of the edges of the cube = ");
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        double v = Math.pow(a, 3);
        double s = 6 * Math.pow(a, 2);
        System.out.println("result: \n" +"capacity = "+ v+"\narea = "+s);
        scanner.close();
    }
}