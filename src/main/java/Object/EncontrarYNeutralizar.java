package Object;

import java.util.ArrayList;
import java.util.Iterator;

public class EncontrarYNeutralizar {
    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>();
        words.add("Hello world!");
        words.add("Amigo");
        words.add("Elly");
        words.add("Kerry");
        words.add("Bug");
        words.add("bug");
        words.add("Easy ug");
        words.add("Risha");

        ArrayList<String> wordsFirstCopy = new ArrayList<>(words);
        ArrayList<String> wordsSecondCopy = new ArrayList<>(words);
        ArrayList<String> wordsThirdCopy = new ArrayList<>(words);

        removeBugWithFor(wordsFirstCopy);
        removeBugWithWhile(wordsSecondCopy);
        removeBugWithCopy(wordsThirdCopy);

        wordsFirstCopy.forEach(System.out::println);
        String line = "_________________________";
        System.out.println(line);
        wordsSecondCopy.forEach(System.out::println);
        System.out.println(line);
        wordsThirdCopy.forEach(System.out::println);
        System.out.println(line);
    }

    public static void removeBugWithFor(ArrayList<String> list) {
        for (int i = 0; i < list.size(); i++) {
            String str = list.get(i);
            if (str.equalsIgnoreCase("bug")){
                list.remove(str);
                i--;
            }
        }

    }

    public static void removeBugWithWhile(ArrayList<String> list) {
        Iterator<String> it =  list.iterator();
        while (it.hasNext()){
            String str = it.next();
            if (str.equalsIgnoreCase("bug")){
                it.remove();
            }
        }

    }

    public static void removeBugWithCopy(ArrayList<String> list) {
        ArrayList<String> list1 = new ArrayList<>(list);
        for (String str : list1) {
            if (str.equalsIgnoreCase("bug")){
                list.remove(str);
            }
        }

    }
}

