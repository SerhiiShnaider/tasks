package zadach.po.programmirovaniyu.partOne.Begin;

import java.util.Scanner;

/**
 * Created by Elvis on 03.12.2016.
 */

/*Скорость лодки в стоячей воде V км/ч, скорость течения реки U км/ч
(U < V). Время движения лодки по озеру T1 ч, а по реке (против течения) —
T2 ч. Определить путь S, пройденный лодкой (путь = время · скорость).
Учесть, что при движении против течения скорость лодки уменьшается на
величину скорости течения.*/

public class Begin35 {
    public static void main(String[] args) {
        System.out.print("type speed of boat in stagnant water = ");
        Scanner scanner = new Scanner(System.in);
        double speedInStagnantWater = scanner.nextDouble();
        System.out.print("type speed of river flow = ");
        double speedOfRiverFlow = scanner.nextDouble();
        System.out.print("type time in hours of the boat on the lake = ");
        double timeOnLake = scanner.nextDouble();
        System.out.print("type time in hours of the boat on the river = ");
        double timeOnRive = scanner.nextDouble();

        if(speedInStagnantWater > speedOfRiverFlow){
            double wayOnLake = speedInStagnantWater * timeOnLake;
            double wayOnRiver = (speedInStagnantWater - speedOfRiverFlow) * timeOnRive;
            double wayAll = wayOnLake + wayOnRiver;
            System.out.println("boat passed = " + wayAll);
        }else
            System.out.println("invalid data");
        scanner.close();
    }
}
