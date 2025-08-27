package ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class read_10_string {

    public static void main(String[] args) {
        Scanner cn = new Scanner(System.in);

        String[] list = new String[5];
        for (int i = 0; i < list.length; i++){
            String s = cn.nextLine();
            list[i] = s;
        }


        for (int i = 0; i < list.length; i++) {
            int j = list.length -i -1;
            System.out.println(list[j]);
        }
    }
}

 class read_10_line_Arraylist{

     public static void main(String[] args) {
         Scanner console = new Scanner(System.in);
         ArrayList<String> list = new ArrayList<String>();
         for (int i = 0; i < 5; i++) {
             String s = console.nextLine();
             list.add(s);
         }
         for (int i = 0; i < list.size(); i++) {
             int j = list.size() -i -1;
             System.out.println(list.get(j));
         }
     }

}