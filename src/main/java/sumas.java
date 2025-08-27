import java.util.Scanner;

public class sumas {
            public static char first = '\u004A';//j
            public static char second = 'a';
            public static char third = '\u0076';//v
            public static char fourth = 'a';

            public static void main(String[] args) {
                System.out.print(first);
               System.out.print(second);
                System.out.print(third);
                System.out.println(fourth);

    int decimalNumber = 21;
        System.out.println("Decimal number " + decimalNumber + " is equal to octal number " + toOctal(decimalNumber));
    int octalNumber = 25;
                    System.out.println("Octal number " + octalNumber + " is equal to decimal number " + toDecimal(octalNumber));
}


public static int toOctal(int decimalNumber) {
    //escribe aquí tu código
    int octal = 0;
    if (decimalNumber <= 0) {
        return octal;
    }
    int i = 0;
    while (decimalNumber != 0){
        octal = (int)(octal + (decimalNumber % 8) * Math.pow(10, i++));
        octal = decimalNumber / 8;
    }
    return octal;
}

public static int toDecimal(int octalNumber) {
    //escribe aquí tu código
    int decimalNumber = 0;
    if (octalNumber <= 0){
        return decimalNumber;
    }
    int i = 0;
    while(octalNumber != 0){
        decimalNumber = (int)(decimalNumber + (octalNumber % 10) * Math.pow(8, i++));
        octalNumber = octalNumber  / 10;
    }
    return decimalNumber;
        }

}
