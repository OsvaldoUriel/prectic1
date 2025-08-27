package Lecion_3_level_18;

import java.util.ArrayList;
import java.util.Collections;

public class EncontrarElementos {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Collections.addAll(list, 11, 2, 13, 578, 53);

        int min = Collections.min(list);
        int max = Collections.min(list);

        System.out.println(min);
        System.out.println(max);
        System.out.println("------------");


        ArrayList<Integer> list2 = new ArrayList<>();
        Collections.addAll(list2, 11, 2, 23, 5, 15, 4, 2, 4);

        int count = Collections.frequency(list2, 4);
        System.out.println(count);
        System.out.println("_______");

    Collections.sort(list2);

    int index = Collections.binarySearch(list2,5);
    System.out.println(index);

    int index2 = Collections.binarySearch(list2,15);
    System.out.println(index2);

        int index3 = Collections.binarySearch(list2,16);
        System.out.println(index3);

    }
}
