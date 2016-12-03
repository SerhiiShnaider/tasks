package zadach.po.programmirovaniyu.partOne.Begin;

import java.util.Scanner;

/**
 * Created by Elvis on 03.12.2016.
 */

/*Дано значение температуры T в градусах Фаренгейта. Определить
значение этой же температуры в градусах Цельсия. Температура по
Цельсию TC и температура по Фаренгейту TF связаны следующим
соотношением: TC = (TF – 32)·5/9*/

public class Begin31 {
    public static void main(String[] args) {
        System.out.print("type t in fahrenheit = ");
        Scanner scanner = new Scanner(System.in);
        double tF = scanner.nextDouble();
        double tC = (tF - 32) * 5 / 9;
        System.out.println("temperature in celsius = " + tC);
        scanner.close();
    }
}
