package zadach.po.programmirovaniyu.partOne.If;

import java.util.Scanner;

/**
 * Created by Elvis on 06.12.2016.
 */

/*Даны две переменные вещественного типа: A, B. Перераспределить
значения данных переменных так, чтобы в A оказалось меньшее из значений,
а в B — большее. Вывести новые значения переменных A и B.*/

public class If9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("type integer number = ");
        int a = scanner.nextInt();
        System.out.print("type integer number = ");
        int b = scanner.nextInt();
        if(a < b){
            System.out.print("b is bigger number = " + b);
            System.out.print("\na ia less number = " + a);
        }else{
            int tmp = b;
            b = a;
            a = tmp;
            System.out.print("b is bigger number = " + b);
            System.out.print("\na ia less number = " + a);
        }
    }
}
