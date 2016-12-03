package zadach.po.programmirovaniyu.partOne.Begin;

import java.util.Scanner;

/**
 * Created by Elvis on 03.12.2016.
 */

/*Известно, что X кг конфет стоит A рублей. Определить, сколько стоит
1 кг и Y кг этих же конфет.*/

public class Begin33 {
    public static void main(String[] args) {
        System.out.print("type in kg weight of candies = ");
        Scanner scanner = new Scanner(System.in);
        double weight = scanner.nextDouble();
        System.out.print("type how much candies cost = ");
        double cost = scanner.nextDouble();
        double oneKgCost = cost / weight;
        System.out.println("one kg of candies cost = " + oneKgCost);
        System.out.print("type in kg how much candies you want buy = ");
        double weightToBuying = scanner.nextDouble();
        double costToBuying = weightToBuying * oneKgCost;
        System.out.println("you must pay = " + costToBuying);
        scanner.close();
    }
}
