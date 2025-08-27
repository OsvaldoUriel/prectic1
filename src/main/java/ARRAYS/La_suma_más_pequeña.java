package ARRAYS;

import java.util.Scanner;

public class La_suma_más_pequeña {

    public static int[][] array = new int[3][3];

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                array[i][j] = scanner.nextInt();
            }
        }
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < 3; i++) {
            int curret = array[0][i] + array[1][i] + array[2][i];
            if(min > curret){
                min = curret;
            }
        }

        for (int i = 0; i < 3; i++) {
            int curret =  array[i][0] + array[i][1] + array[i][2];
            if(min > curret){
                min = curret;
            }}

        System.out.println(min);


    }

    public static class arrays2D {
        public static int[][] MULRIPLICATION_TABLE;
        public static int[][] multiArray;
        public static int[][] array;
    public static int[][] array2 = new int[3][3];
        public static void main(String[] args) {

            int x = 10;
            int y = 10;
            MULRIPLICATION_TABLE = new int[x][y];
           /* for(int i = 1; i<= 10; i++){//concepto altura
            for(int j = 1; j <= 10; j++){//ancho
    MULRIPLICATION_TABLE[i - 1][ j - 1 ] = i*j;
                System.out.print(MULRIPLICATION_TABLE[i - 1][j-1]);
                System.out.println(" ");// primera y segunda
                }
                        System.out.println();
            } */ // te da los multiplos de 10 y uno cada renglon y despues hace lo que pide la taks
            //pero lo hace vertical

            System.out.println("♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥");

            int contador = 1;
            for (int i = 0; i < MULRIPLICATION_TABLE.length; i++) {
                for (int j = 0; j < MULRIPLICATION_TABLE[i].length; j++) {
                    MULRIPLICATION_TABLE[i][j] = contador++;
                }
            }
            for (int[] arreglo : MULRIPLICATION_TABLE) {
                for (int number : arreglo) {
                    System.out.print(number + ",");
                }
                System.out.println();
            }// te imprime todos los números y cúando llega a un  múltiplo de 10 pasa a al
            // siguiente reglón

            System.out.println("▼▼▼▼▼▼▼▼▼☺▼ ");

            int[][] name = new int[3][];
            name[0] = new int[]{1, 2, 3, 4, 5, 6};
            name[1] = new int[]{1, 2, 3};
            name[2] = new int[]{1};
            for (int i = 0; i < name.length; i++) {
                for (int j = 0; j < name[i].length; j++)
                    System.out.print(name[i][j] + " ");
                System.out.println();
            }

            int[][] matrix = new int[8][4];
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[i].length; j++)
                    matrix[i][j] = i + j;
            }
            System.out.println("matrix[7][3] = " + matrix[7][3]);
            System.out.println("matrix[3][0] = " + matrix[3][0]);

            System.out.println("Creacion de array bidimensionales");

            Scanner con = new Scanner(System.in);
          /*  int x2 = Integer.parseInt(con.nextLine());


            multiArray = new int[x][];
            for (int i = 0; i < x; i++) {//se definira el tamaños dela fila i
                int size = Integer.parseInt(con.nextLine());  // definira el tamaño de las columnas
                multiArray[i] = new int[size];// permite que cada fila tenga un tamaño diferente

            }*/



            array = new int[2][3];
            int contador2 = 1;
           for (int i = 0; i < array.length; i++){
               for(int j = 0; j < array[i].length; j++ ){
                   array[i][j] = contador2++;
               }
           }
    for(int[] arreglo2 : array){
        for(int number2 : arreglo2){
            System.out.print(number2 + ",");
        }
        System.out.println();
    }

           // Scanner con = new Scanner(System.in);
            int max = Integer.MIN_VALUE;
            for(int i = 0; i < array2.length; i++){
                for(int j = 0; j < array2[i].length; j++){
                    array[i][j] = con.nextInt();
                    if(max < array2[i][j]){
                        max = array2[i][j];
                    }

                }
            }System.out.println(max);








        }
    } /*for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
    array[i][j] = 1 + i + j;
                }
                        }

                        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; i++) {
            System.out.println(array[i][j]);
                }
                        }*/
}
