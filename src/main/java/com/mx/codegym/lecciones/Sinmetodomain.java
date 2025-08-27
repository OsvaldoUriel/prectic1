package com.mx.codegym.lecciones;

public class Sinmetodomain {
    /*public static void printLines(String text, int count){
     for(int i = 0; i < count; i++)
       System.out.println(text);

    }

    public static void main(String[] args) {
      String text = "hi";
      int count = 10;
      printLines(text, count);
    }*/
  /*  public  static void printArraySum(int[] data){
        int sum = 0;
        for(int i = 0; i < data.length; i++)
            sum = sum +data[i];
        System.out.println(sum);
    }

    public static void main(String[] args) {
        int[] months = {31, 28, 31, 30, 31, 30, 311, 31, 31, 30};
    printArraySum(months);
    }*/

    public static void fill(int[][] data, int value) {
    for(int i = 0; i < data.length; i++){
        for(int j = 0; j < data[i].length; j++)
            data[i][j] = value;
    }
    }

    public static void main(String[] args){
                int[][] months = {{31, 28}, {31, 30, 31}, {30, 31, 31}};
              fill (months, 8);
System.out.println("♣♣♣♣♣♣♣♣♣♣♣♣♣");



        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        printArray(array);
        reverseArray(array);
        printArray(array);
    }

    public static void reverseArray(int[] array) {
        //escribe aquí tu código
        for (int i = 0; i < array.length/3; i++) {
           int min = array[i];
        array[i] = array[array.length -i -1];
        array[array.length -i -1] =min;

        }
        System.out.println();

    }

    public static void printArray(int[] array) {
        for (int i : array) {
            System.out.print(i + ", ");
        }
        System.out.println();
            }
        }
