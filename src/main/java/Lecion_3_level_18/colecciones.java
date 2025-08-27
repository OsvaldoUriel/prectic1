package Lecion_3_level_18;

import javax.sql.rowset.serial.SerialStruct;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class colecciones {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Collections.addAll(list, 1, 2, 3, 4, 5);
        for (int i : list) {
            System.out.println(i);
        }

    list.add(1);
    list.add(2);
    list.add(3);

    Collections.fill(list, 10);

        for (int i : list) {
            System.out.println(i);
        }
        System.out.println("____________");



        List<String> immutable = Collections.nCopies(5, "Hello");
        ArrayList<String> list2 = new ArrayList<>(immutable);
        for (String s : list2) {
            System.out.println(s);

        }
        System.out.println("-------------");

        ArrayList<Integer> list3 = new ArrayList<>();
        list3.add(1);
        list3.add(2);
        list3.add(3);

Collections.replaceAll(list3,2,20);
        for (int i : list3) {
            System.out.println(i);
        }

        System.out.println("|||||||||||||||");

        ArrayList<Integer> srcList = new ArrayList<>();
        Collections.addAll(srcList, 99, 98, 97);

        ArrayList<Integer> desList= new ArrayList<>();
        Collections.addAll(desList, 1, 2, 3, 4, 5, 6, 7);
        Collections.copy(desList, srcList);

        for (int i : desList) {
         System.out.println(i);
        }


    }
}
