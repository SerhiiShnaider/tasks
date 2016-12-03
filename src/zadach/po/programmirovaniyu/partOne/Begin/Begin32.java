package zadach.po.programmirovaniyu.partOne.Begin;

import java.util.Scanner;

/**
 * Created by Elvis on 03.12.2016.
 */
/*Дано значение температуры T в градусах Цельсия. Определить
значение этой же температуры в градусах Фаренгейта. Температура
по Цельсию TC и температура по Фаренгейту TF связаны следующим
соотношением: TC = (TF – 32)·5/9.*/

public class Begin32 {
    public static void main(String[] args) {
        System.out.print("type t in celsius = ");
        Scanner scanner = new Scanner(System.in);
        double tC = scanner.nextDouble();
        double tF = (tC * 9 / 5) + 32;
        System.out.println("temperature in fahrenheit = " + tF);
        scanner.close();
    }
}
