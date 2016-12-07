package zadach.po.programmirovaniyu.partOne.If;

import java.util.Scanner;

/**
 * Created by Elvis on 07.12.2016.
 */

/*Даны две переменные целого типа: A и B. Если их значения не равны, то
присвоить каждой переменной сумму этих значений, а если равны, то присвоить
переменным нулевые значения. Вывести новые значения переменных A и B*/

public class If10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("type integer number a = ");
        int a = scanner.nextInt();
        System.out.print("type integer number b = ");
        int b = scanner.nextInt();
        if (a == b) {
            a = 0;
            b = 0;
            System.out.print("a = " + a + "\nb = " + b);
        } else {
            a = a + b;
            b = a;
            System.out.print("a = " + a + "\nb = " + b);


        }
    }
}
