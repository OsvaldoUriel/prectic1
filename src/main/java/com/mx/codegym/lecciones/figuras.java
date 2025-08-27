package com.mx.codegym.lecciones;

public class figuras {
    public static String partyFace = "\uD83E\uDD73";
    public static String balloon = "\uD83C\uDF88";
    public static String gift = "\uD83C\uDF81";
    public static String partyPopper = "\uD83C\uDF89";
    public static String cake = "\uD83C\uDF82";


    public static void main(String[] args) {
        String happyBirthday = "Happy birthday!";
        String congratulation = partyFace + balloon + partyPopper + cake + gift;
        System.out.println(happyBirthday + congratulation);

        int n = 6;
        for (int i = n / 2; i < n; i += 2) {
            for (int j = 1; j < n - i; j += 2) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("♥");
            }
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("♥");
            }
            System.out.println();
        }
        for (int i = n; i >= 1; i--) {
            for (int j = i; j < n; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (i * 2) - 1; j++) {
                System.out.print("♥");
            }
            System.out.println();
        }
        System.out.println("________________________");



        for (int i = 1; i <= 5; i++) { // si le pones un "==" en vez de un "<=" el ciclo los sube a 5 sin ningun proceso
            for (int j = 1; j <= 9; j++) {
                if (j == 6 - i || /**/i == 3 && j >= 3 && j <= 7 /**/ || j == 4 + i)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();//esta linea se activa cuando "j" llage 9 porque es su metodo de paro(linea 35)

        }
        System.out.println("○○○○○c○○c○○○○○");

/*for(int i = 1; i <= 7; i++){
    for(int j = 1; j <= 7; j++){
        if()
    }
}*/

      /*  for (int i = 1; i <= 5; i++) { // si le pones un "==" en vez de un "<=" el ciclo los sube a 5 sin ningun proceso
            for (int j = 1; j <= 9; j++) {
                if (j == 6 - i)
                    System.out.print("*");
                else if (i == 3 && j >= 3 && j <= 7)
                    System.out.print("*");
                else if (j == 4 + i)
                    System.out.print("*");
                else
                    System.out.println();*/

        String a1 = "\"Friend\"wass nominated for an \"Oscar\"";
        System.out.println(a1);
        char a2 = '"';
        System.out.println("Besst regaards, \n Anonymous");
        System.out.println("0\t1\t2\t3");
        System.out.println("hello\bworld");
        System.out.println("Greetings\rwolrd!");
        System.out.println("c:\\projects\\my\\first");
        System.out.println("\uD83D\uDD0A");
    }
}
/*int a1 = 1;
//int $a;
//int $A;
//int 1a;*/