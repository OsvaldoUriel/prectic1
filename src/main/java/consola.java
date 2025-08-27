import java.util.Scanner;

public class consola {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
  /* double a = console.nextDouble();
   double b = console.nextDouble();

        double c =  a/b;
   System.out.println("La respuesta es:" + c);*/


/*int max = 0;
while(console.hasNextInt()){
    int x = console.nextInt();
    if (x > max)
        max = x;

}    System.out.println("Max es equivalente a:" + max);*/

System.out.println("-------------------------------------------");
        Scanner con = new Scanner(System.in);
        double k = con.nextDouble();
        double RO = con.nextDouble();
        while(con.hasNextDouble()){
            double ar = con.nextDouble();
            if (ar > RO)
                RO = ar;
System.out.println(k);
            System.out.println(RO);
            System.out.println(ar);

        }

    }
}
