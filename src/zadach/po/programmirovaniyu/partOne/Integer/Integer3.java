package zadach.po.programmirovaniyu.partOne.Integer;

import java.util.Scanner;

/**
 * Created by Elvis on 04.12.2016.
 */

/*Дан размер файла в байтах. Используя операцию деления нацело,
найти количество полных килобайтов, которые занимает данный файл
(1 килобайт = 1024 байта).*/

public class Integer3 {
    public static void main(String[] args) {
        System.out.print("type size in byte = ");
        Scanner scanner = new Scanner(System.in);
        int sizeInByte = scanner.nextInt();
        int  kilobytes = sizeInByte / 1024;
        System.out.println("size in kilobytes = " + kilobytes);
        scanner.close();
    }
}

