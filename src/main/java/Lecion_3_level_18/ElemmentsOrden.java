package Lecion_3_level_18;

import java.util.ArrayList;
import java.util.Collections;

public class ElemmentsOrden {
    public static void main(String[] args) {

        ArrayList<Integer> number = new ArrayList<>();
        Collections.addAll(number, 1, 2, 3, 4, 5, 6, 7, 8);

        Collections.reverse(number);
        for (int i : number) {
            System.out.println(i);
        }
        System.out.println("__________");
//Cisrado cesar
        Collections.rotate(number,3);
        for (int i :number) {
            System.out.println(i);

        }

        System.out.println("----------");

        ArrayList<Integer> number2 = new ArrayList<>();
Collections.addAll(number2, 11, 1154, 1, 56, 12);

Collections.sort(number2);

        for (int i : number2) {
            System.out.println(i);
        }

        ArrayList<Integer> number3 = new ArrayList<>();
        Collections.addAll(number2,1, 2, 3 ,4 ,5 );

        Collections.shuffle(number3);
        for (int i : number3) {

            System.out.println(i);
        }


    }

}
