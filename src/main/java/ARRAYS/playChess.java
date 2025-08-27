package ARRAYS;

import java.util.Scanner;

public class playChess {
    public static char[][] array;

    public static void main(String[] args) {
        Scanner cn = new Scanner(System.in);
        int number = cn.nextInt();
        array = new char[number][number];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                if ((i + j) % 2 == 0){
                    array[i][j] = '#';
                }else {
                    array[i][j] = ' ';
                }
            }
        }

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                System.out.print(array[i][j]);
            }
            System.out.println();
        }


    }
}
