package zadach.po.programmirovaniyu.partOne.Begin;

import java.util.Scanner;

/**
 * Created by Elvis on 03.12.2016.
 */

/*Скорость первого автомобиля V1 км/ч, второго — V2 км/ч, расстояние
между ними S км. Определить расстояние между ними через T часов, если
автомобили удаляются друг от друга. Данное расстояние равно сумме
начального расстояния и общего пути, проделанного автомобилями; общий
путь = время · суммарная скорость.*/

public class Begin36 {
    public static void main(String[] args) {
        System.out.print("type speed first car = ");
        Scanner scanner = new Scanner(System.in);
        double speedFirstCar = scanner.nextDouble();
        System.out.print("type speed second car = ");
        double speedSecondCar = scanner.nextDouble();
        System.out.print("type distance between cars = ");
        double distanceStart = scanner.nextDouble();
        System.out.print("type time that cars were on the road = ");
        double time = scanner.nextDouble();
        double distanceAll = ((speedFirstCar + speedSecondCar) * time) + distanceStart;
        System.out.println("distance between cars by " + time + " hours is: " + distanceAll);
        scanner.close();
    }
}
