package Object;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class ConUnFor {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("E");
        Iterator<String> it = list.iterator();
        while (it.hasNext()){
            String str = it.next();
            System.out.println(str);
        }
        System.out.println("----------------------------------");

        ArrayList<String> list2 = new ArrayList<>();
        list2.add("a");
        list2.add("b");
        list2.add("c");
        list2.add("d");
        list2.add("e");
        for (int i = 0; i < list2.size(); i++) {
            String str = list2.get(i);
            System.out.println(str);
        }
        System.out.println("----------------------------------");

        ArrayList<String> list3 = new ArrayList<>();
        list3.add("f");
        list3.add("g");
        list3.add("h");
        list3.add("i");
        list3.add("j");
        for (String str : list3) {
            System.out.println(str);
        }
        System.out.println("____________________");
        ArrayList<String> list4 = new ArrayList<>();
        list4.add("k");
        list4.add("l");
        list4.add("m");
        list4.add("p");
        list4.add("q");
        //        dará error
        /*for (String str : list4) {
if (str.equals("k"))
     list4.remove(str);
        }*/
        for (int i = 0; i < list4.size(); i++) {
            String str = list4.get(i);
            if (str.equals("k")){
                list4.remove(str);
                i--;
            }
        System.out.println(str);

        }//no es adecuada para HashSet y HashMap colecciones





        }

    }
