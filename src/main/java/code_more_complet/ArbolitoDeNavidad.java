package code_more_complet;

import java.util.Scanner;

public class ArbolitoDeNavidad {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese la altura del arbol");
        int altura = scanner.nextInt();

        for (int i = 0; i < altura; i++) {
            int cantSpacios = altura -i - 1;

            for (int j = 0; j < cantSpacios; j++) {

                System.out.print(" ");
            }
            int cantAsteriscos = 2* i +1;
            for (int j = 0; j < cantAsteriscos; j++) {
                System.out.print("*");
            }

            System.out.println();

        }



    }
}
