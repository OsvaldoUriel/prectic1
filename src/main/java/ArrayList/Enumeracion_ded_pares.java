package ArrayList;

import java.util.ArrayList;

public class Enumeracion_ded_pares {
    public static void main(String[] args) {

    ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i = 1; i <= 20 ; i++) {
            if((i % 2) == 0){
                list.add(i);
            }
        }
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i));
        }
        System.out.println();

        for(int i = 0; i < list.size(); i++){
    if ((list.get(i)&4) == 0){
        list.remove(i);
        i--;
    }
}
for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

    }
}