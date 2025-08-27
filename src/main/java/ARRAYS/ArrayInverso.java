package ARRAYS;

import java.util.Scanner;

public class ArrayInverso {
  public static int [] array;
    public static void main(String[] args) {
        Scanner con = new Scanner(System.in);
        int N = Integer.parseInt(con.nextLine());
        array = new int[N];

        for (int i = 0; i < N; i++) {
            array[i] = Integer.parseInt(con.nextLine());
        }

        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            int number = array[i];
            if (number > max){
                max = number;
            }
        }
        System.out.println(max);

    }

}

