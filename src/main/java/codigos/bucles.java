package codigos;

import java.util.Arrays;

public class bucles {
    public static void main(String[] args) {
     /*   Scanner scanner = new Scanner(System.in);
        int start = scanner.nextInt();
        int end = scanner.nextInt();
        int multiple = scanner.nextInt();

        int sum = 0;
        //escribe aquí tu código
        for (int t = 0;t < end;t++){
            if ((t & multiple)!=0)continue;
            sum += t;

        }  System.out.println(sum);*/

   /*     int f = 1;
        for (int i = 1; i < 10; i++)
            f = f * i;
        System.out.println(f);
        System.out.println("►►►►►►►►►►►1♠►►►►►►►►►►►►►►►►►►►►►►►►►♠►►►►♠");

        for (int a = 0; a < 10; a++) {
            int starCount = 10 - a;
            for (int j = 0; j < starCount; j++)
                System.out.print("*");
            System.out.println();

        }
        int one = 1;
        do {
            System.out.println(one);
            one++;
        } while (one <= 5);
        System.out.println("►►►►►►►►►►►1♠►►►►►►►►►►►►►►►►►►►►►►►►►♠►►►►♠");


        int number = 1234;
        int sum = 0;
        do {
            sum += number % 10;
            number /= 10;
        } while (number > 0);
    System.out.println("La suma de los dígitos es:" + sum);

   int x = 1;
   do{
       System.out.println(x);
       x = x+1;
   }while(x<=10 );

System.out.println("2♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣♣");

        int a = 1;
        int suma = 0;
        while (a <= 100) {

            if (a % 3 == 0) {
                a++;
                continue;
            }
            suma += a ;
            a++;
        } System.out.println(suma);


/* esto es un bucle infinito, claro ejemplo que la IA no puede remprasar a los prgroamdores
       String ñ = con.nextLine();
        int numbe = con.nextInt();
        int sumas = 0;
        if (numbe >= 0 && numbe <= 5 ) {
            do {
                System.out.println(a);
                sum++;

            }
            while (sumas < numbe);
        }else {System.out.println(a);}
for (int j =0; j <10; j++){
    continue;
    System.out.println(j);
}*/
    //    System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
/*   String cadena = con.nextLine();
   int numer = con.nextInt();
   int zero = 0;
   if (number > 0 && number < 5){
       do{                                       otro codigo que saque de una IA y esta mal
            System.out.println(cadena);
           zero++;
       }while(zero < number);
   }else{
       System.out.println(cadena);*/

     /*   Scanner con = new Scanner(System.in);
        String cadena = con.nextLine();
        int numer = con.nextInt();
        int zero = 0;
        if (number > 0 && number < 5){
            do{                              //           otro codigo que saque de una IA y esta mal
                System.out.println(cadena);
                zero++;
            }while(zero < number);
        }else{
            System.out.println(cadena);
*/
 System.out.println("--------------------------");

        int n = 6;
        for(int i = n/2; i < n; i += 2 ){
            for(int j = 1; j < n - i ; j += 2){
                System.out.print(" ");
            }
            for ( int j = 1; j <= i; j++){
                System.out.print("♥");
            }
            for (int j = 1; j <= n - i; j++){
                System.out.print(" ");
            }
            for(int j = 1; j <= i; j++){
                System.out.print("♥");
            }
            System.out.println();
        }
        for( int i = n; i >= 1; i--){
            for( int j = i; j < n; j++){
                System.out.print(" ");
            }
            for( int j = 1; j <= (i*2) - 1; j++){
                System.out.print("♥");
            }
            System.out.println();
        }

        int[]  x = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        Arrays.fill(x, 3, 7, 999);
        String str = Arrays.toString(x);
System.out.println(str);

    int[] x2 ={-55, -82, 2, 5, 44, 100, -91, 800};
        Arrays.sort(x2);

        String str2 =  Arrays.toString(x2);
    System.out.println(str2);

    }
    }



