package zadach.po.programmirovaniyu.partOne.Integer;

import java.util.Scanner;

/**
 * Created by Elvis on 04.12.2016.
 */

/*С начала суток прошло N секунд (N — целое).
Найти количество секунд, прошедших с начала последнего часа*/

public class Integer22 {
    public static void main(String[] args) {
        System.out.print("type count of sec = ");
        Scanner scanner = new Scanner(System.in);
        int sec = scanner.nextInt();
        int  hour = (sec / 60) / 60;
        int  secRemainder = sec - (((hour * 60)) * 60);
        System.out.println("full second passed from the beginning of last hour = " + secRemainder);
        scanner.close();
    }
}
