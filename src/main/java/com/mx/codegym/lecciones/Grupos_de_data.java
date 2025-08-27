package com.mx.codegym.lecciones;

public class Grupos_de_data {
    public static void printlPoints(int[] z, int[] c, int[] colo){
     for(int i = 0; i < z.length; i++)
     System.out.println("Color of(" + z[i] + ", " + c[i] + " ) = " + colo[i]);
    }

    public static void main(String[] args) {
        int[] z = new int[10];
        int[] c =new int[10];
        int[] colo = new int[10];
    printlPoints(z, c, colo);

    }
}
