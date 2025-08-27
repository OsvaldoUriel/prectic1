package ARRAYS;

import java.util.Scanner;

public class Array_with_if {
    public static String[][] array = new String[][]{{"123", "Ikan", "Brad"},
            {"1425", "Pendleton", "Maria"},
            {"37", "Brad", "Andy"},
            {"98", "Bradford", "Maria"},
            {"6285", "Prost", "Sandra"},
            {"8", "Clover", "Ellen"},
            {"754", "Colton", "Isaac"}};

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String con = scanner.nextLine();
        for (int i = 0; i < array.length; i++) {
            if (array[i][0].equals(con) || array[i][1].equals(con) || array[i][2].equals(con)){
                System.out.println(array[i][0] + " " + array[i][1] + " " + array[i][2]);
            }
        }
String  hi = "hi";
        System.out.println(hi.hashCode());


    }
}
