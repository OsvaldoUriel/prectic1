package codigos;

import java.util.Scanner;

public class comparaciondecadenas {
    public static void main(String[] args) {
        try {String text = "10 20 30 40";
            Scanner console = new Scanner(text);
            int a = console.nextInt();
            int b = console.nextInt();
            int c = console.nextInt();
            int d = console.nextInt();
            System.out.println(c);}
        catch ( Exception e ){
            System.err.println("Esta mal");
        }
        String texto = "hola";
        String mensaje = texto;
        String s1 = texto.toUpperCase();
        String s2 = texto.toUpperCase();
        System.out.println(texto == mensaje);
        System.out.println(texto == s1);
        System.out.println(s1 == s2);

        Scanner console = new Scanner(System.in);
        String a = "Ammigo";
        String b = "Diego";
        if (a.equals(b)){
            System.out.println("Las cadenas son iguales");}
       else
        {
            System.out.println("Las cadenas son diferentes");}

System.out.println ("----------------------");
        Scanner consola = new Scanner(System.in);
        String c = "amigo";
        String d = "amiga";
        String result = c.equals(d) ? "same" : "differnt";
System.out.println(result);



        String h = "learm";
        String g = "java";
        String k = "!";
        //String R = consola.nextLine();
      int n = 0;
       while(true)
        {
            String tec = console.nextLine();

            if (tec.equals("basta"))
                break;
            System.out.println(tec);
        }

    }

}
