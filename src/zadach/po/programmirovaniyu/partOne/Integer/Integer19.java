package zadach.po.programmirovaniyu.partOne.Integer;

import java.util.Scanner;

/**
 * Created by Elvis on 04.12.2016.
 */

/*С начала суток прошло N секунд (N — целое). Найти количество
полных минут, прошедших с начала суток.*/

public class Integer19 {
    public static void main(String[] args) {
        System.out.print("type count of sec = ");
        Scanner scanner = new Scanner(System.in);
        int sec = scanner.nextInt();
        int min = sec / 60;
        System.out.println("full minutes passed from the beginning of the day = " + min);
        scanner.close();
    }
}
