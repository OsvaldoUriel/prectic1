package ARRAYS;

import java.util.Scanner;

public class EliminaCadenasDuplicadas {
    public static String[] strings;

    public static void main(String[] args) {
        Scanner con = new Scanner(System.in);
        strings = new String[6];

        for (int i = 0; i < 6; i++) {
            strings[i] = con.nextLine();
        }

        for (int i = 0; i < strings.length; i++) {
            String curretString = strings[i];
            for (int j = i + 1; j < strings.length; j++) {
                if(curretString == null){
                    break;
                }
                if(curretString.equals(strings[j])){
                    strings[i] = null;
                    strings[j] = null;
                }
            }
        }
      
        for (int i = 0; i < strings.length; i++) {
            System.out.println(strings[i] + ", ");
        }

    }

}
