package zadach.po.programmirovaniyu.partOne.Begin;

import java.util.Scanner;

/**
 * Created by Elvis on 01.12.2016.
 */


/*Даны два круга с общим центром и радиусами R1 и R2 (R1 > R2). Найти
площади этих кругов S1 и S2, а также площадь S3 кольца, внешний радиус
которого равен R1, а внутренний радиус равен R2:
S1 = π·(R1)2, S2 = π·(R2)2, S3 = S1 – S2.
В качестве значения π использовать 3.14.*/
public class Begin13 {
    public static void main(String[] args) {
        System.out.print("type r1 = ");
        Scanner scanner = new Scanner(System.in);
        double r1 = scanner.nextDouble();
        System.out.print("type r2 = ");
        double r2 = scanner.nextDouble();
        if (r1 > 0 && r2 > 0 && r1 > r2) {
            double s1 = Math.PI * Math.pow(r1, 2);
            double s2 = Math.PI * Math.pow(r2, 2);
            double s3 = s1 - s2;
            System.out.println("s1 = " + s1 + "\ns2 = " + s2 + "\ns3 = " + s3);
        } else
            System.out.println("invalid data");
        scanner.close();
    }
}
