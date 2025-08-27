package ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class removver_pascal {
    public static ArrayList<String> programmingLanguages = new ArrayList<>(Arrays.asList("C", "C++", "Python", "JavaScript", "Ruby", "Java", "Pascal"));

    public static void main(String[] args) {
        //escribe aquí tu código
        for (int i = 0; i < programmingLanguages.size(); i++) {
            if (programmingLanguages.get(i).equals("Pascal")){
                programmingLanguages.remove(i);
            }
        }

    }
}
