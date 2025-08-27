package ARRAYS;

import java.util.Scanner;

public class triangle {
    public static char[][] array;

    public static void main(String[] args) {
            Scanner cn = new Scanner(System.in);
            int number = cn.nextInt();
            array = new char[number][2 * number - 1];
            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array[0].length; j++) {
                    if (j < array.length - i - 1 || j > array[0].length - array.length + i) {
                        array[i][j] = ' ';
                    } else {
                        array[i][j] = '#';
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