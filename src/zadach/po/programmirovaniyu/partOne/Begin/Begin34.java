package zadach.po.programmirovaniyu.partOne.Begin;

import java.util.Scanner;

/**
 * Created by Elvis on 03.12.2016.
 */

/* Известно, что X кг шоколадных конфет стоит A рублей, а Y кг ирисок
стоит B рублей. Определить, сколько стоит 1 кг шоколадных конфет, 1 кг
ирисок, а также во сколько раз шоколадные конфеты дороже ирисок.*/

public class Begin34 {
    public static void main(String[] args) {
        System.out.print("type in kg weight of chocolate candies = ");
        Scanner scanner = new Scanner(System.in);
        double weightChocolateCandies = scanner.nextDouble();
        System.out.print("type how much chocolate candies cost = ");
        double costChocolateCandies = scanner.nextDouble();

        System.out.print("\ntype in kg weight of iris candies = ");
        double weightIrisCandies = scanner.nextDouble();
        System.out.print("type how much Iris candies cost = ");
        double costIrisCandies = scanner.nextDouble();

        double oneKgChocolateCandiesCost = costChocolateCandies / weightChocolateCandies;
        double oneKgIrisCandiesCost = costIrisCandies / weightIrisCandies;
        System.out.println("\none kg of chocolate candies cost = " + oneKgChocolateCandiesCost);
        System.out.println("one kg of iris candies cost = " + oneKgIrisCandiesCost);

        double costDifferent = 0;
        if (costChocolateCandies > costIrisCandies) {
            costDifferent = oneKgChocolateCandiesCost / oneKgIrisCandiesCost;
            System.out.println("\nchocolate candies are expensive in " + costDifferent + " times");
        } else {
            costDifferent = oneKgIrisCandiesCost / oneKgChocolateCandiesCost;
            System.out.println("iris candies are expensive in " + costDifferent + " times");
        }
        scanner.close();
    }
}
