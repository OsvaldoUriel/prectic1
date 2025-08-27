package com.mx.codegym.lecciones;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;

public class ARRAYS {
    public static int[] array = new int[]{-1, 2, 3, -4, -5};

    public static final String ODD = "Odd";
    public static final String EVEN = "Even";
    public static String[] strings = new String[5];//esta es la array

    public static void main(String[] args) {
        /*int[] intarray;//los primeros corchetes deben que etsar bacios
        int[] array = new int[100];
        double[] array1 = new double[20];//donde esta el texto "array" es el numbre osea dewbe que cambiar
    int[] ARRAYS.Arraya.array2 =   int[] intArray = new int[10];
        double[] doubleArray = new double[10];new int [10];*/

        strings[1] = ODD;
        strings[3] = ODD;
        strings[0] = EVEN;
        strings[2] = EVEN;
        strings[4] = EVEN;
        System.out.print("index = 0");
        System.out.println(" value = " + strings[0]);//esta
        System.out.print("index = 1");
        System.out.println(" value = " + strings[1]);
        System.out.print("index = 2");
        System.out.println(" value = " + strings[2]);//esta
        System.out.print("index = 3");
        System.out.println(" value = " + strings[3]);
        System.out.print("index = 4");
        System.out.println(" value = " + strings[4]);//esta

System.out.println("►►►►►►►►►►►►►►►►►►►►►►►►►►►►►►►►►►►►►►►►►►►►►►►►");



// public static int[] array = new int[]{-1, 2, 3, -4, -5};
        for(int i = 0; i< array.length; i++) {
            if (array[i] % 2==0){
                array[i] = -array[i];
            }
        }

        System.out.println(array[0]);
        System.out.println(array[1]);
        System.out.println(array[2]);
        System.out.println(array[3]);
        System.out.println(array[4]);
        System.out.println("►►►►►►►►►►►►►►►►►►►►►►►►►►►►►►►►►►►►►►►►►►►►►►►►");

        int a = 0;
        int[] array;
        if (a < 10)
            array = new int[10];
        else
            array = new int[20];
        for(int i =0; i <array.length;i++){
            System.out.println(array[i]);
        }
        System.out.println("•◘•◘NNN◘◘◘◘◘8◘8◘◘◘◘◘◘◘◘◘◘◘◘◘◘◘◘◘◘◘◘◘◘◘◘◘");
        //inversor
        Scanner con = new Scanner(System.in);
        int[] ar = new int[10];
        for(int i =0; i < 10; i++){
            ar[i] = con.nextInt();
        }
        for(int i = 9; i>=0; i--){
            System.out.println(ar[i]);
        }

//Encontrar el número minímo de un array
       /* int[] ARRAYS.Arraya.array2 = new int[10];
        for(int i = 0; i < 10; i++) {
            ARRAYS.Arraya.array2[i] = con.nextInt();
        }
        int min = ARRAYS.Arraya.array2[0];
        for(int i = 1; i< 10; i++)
        {if (ARRAYS.Arraya.array2[i] <  min)
        min = ARRAYS.Arraya.array2[i];
        }
System.out.println(min);*/

/*int p = 10;
       int[] ARRAYS.Arraya.array2;
       if (a < 10)
           array = new int[12];
        else
            array = new int[10];
        for ( int i = 0; i < array.length; i++){
            System.out.println(array[i]);
        }*/
int[]numeros;
 numeros = new int[5];
        int[] numerosdos = {1, 2, 3, 4, 5};

int primernumero = numerosdos[4];
System.out.println(primernumero);


        }
    }

