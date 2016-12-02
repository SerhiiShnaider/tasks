package zadach.po.programmirovaniyu.partOne.Begin;

import java.util.Scanner;

/**
 * Created by Elvis on 02.12.2016.
 */


/*Даны три точки A, B, C на числовой оси. Точка C расположена между
точками A и B. Найти произведение длин отрезков AC и BC.*/
public class Begin18 {
    public static void main(String[] args) {
        System.out.print("type point a = ");
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        System.out.print("type point b = ");
        double b = scanner.nextDouble();
        System.out.print("type point c = ");
        double c = scanner.nextDouble();
        if(Math.abs(a) < Math.abs(c) && Math.abs(c) < Math.abs(b)){
            double lengthAC = Math.abs(c - a);
            double lengthBC = Math.abs(b - c);
            double multiplication = lengthAC * lengthBC;
            System.out.println("length AC = " + lengthAC + "\nlength BC = "
                    + lengthBC + "\nAC * BC = " + multiplication);
        }else
            System.out.println("invalid data");
        scanner.close();
    }
}
