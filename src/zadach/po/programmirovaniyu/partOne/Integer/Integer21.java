package zadach.po.programmirovaniyu.partOne.Integer;

import java.util.Scanner;

/**
 * Created by Elvis on 04.12.2016.
 */

/*С начала суток прошло N секунд (N — целое).
Найти количество секунд, прошедших с начала последней минуты.*/

public class Integer21 {
    public static void main(String[] args) {
        System.out.print("type count of sec = ");
        Scanner scanner = new Scanner(System.in);
        int sec = scanner.nextInt();
        int  min = sec / 60;
        int  secRemainder = sec - (min * 60);
        System.out.println("full second passed from the beginning of last minute = " + secRemainder);
        scanner.close();
    }
}
