import java.util.Scanner;

public class comparacion {
    public static void main(String[] args) {
   Scanner con = new Scanner(System.in);
        String cadena = con.nextLine();
        int number1 = con.nextInt();
        int need = 0;
        if (number1 > 0 && number1 < 5) {
            do {
                System.out.println(cadena);
                need++;
            } while (need < number1);//(number1 <= 0 && number1 >= 5);
        } else {
            System.out.println(cadena);
        }

System.out.println("----------------------------------");
        Scanner con2 = new Scanner(System.in);
        String cadena2 = con.nextLine();
        int numer = con2.nextInt();
        int zero = 0;
        if (number1 > 0 && number1 < 5){
            do{                              //           otro codigo que saque de una IA y esta mal
                System.out.println(cadena);
                zero++;
            }while(zero < number1);
        }else{
            System.out.println(cadena);

        }
    }
}
