package code_more_complet;

import java.util.Scanner;
import java.util.stream.StreamSupport;

public class combetirunarutadearchivo {
    public static void main(String[] args) {
        Scanner con = new Scanner(System.in);//solucion 1: usando una matriz de caracteres
        String path = con.nextLine();
        char[] chars = path.toCharArray();
        for(int i = 0; i < chars.length; i++)
            if(chars[i] == '/')
                chars[i] = '\\';
        String result = new String(chars);
        System.out.println (result);


        String path2 = con.nextLine();//solucion 2: usando los metodos "split() y join()"
        String[] array = path2.split("/");

        String result2 = String.join("\\", array);
        System.out.println(result2);


        String path3 = con.nextLine();//solucion 3: usando el "replace(char oldChar, char newChar)"
    String result3 = path3.replace('/', '\\');
    System.out.println(result3);

    String path4 = con.nextLine();
    if(path4.endsWith(".jpg") || path4.endsWith(".jpeg")){
        System.out.println("This is a jpeg!");
    }
    else if (path4.endsWith(".htm") || path4.endsWith(".html")){
        System.out.println("This is an HTML page" );
    }
    else if (path4.endsWith(".doc") || path4.endsWith(".docx")){
        System.out.println("This is a Word  document");
    }
    else{
        System.out.println("Unknown format");
    }
        String[] urls = {"https://javarush.us", "https://google.com", "http://wikipedia.org", "facebook.com", "https://instagram", "codegym.cc"};
        for (String url : urls) {
            String protocol = checkProtocol(url);
            String domainExtension = checkDomainExtension(url);

            System.out.println("URL address: " + url + ", network protocol - " + protocol + ", domain extension - " + domainExtension);
        }
    }

    public static String checkProtocol(String url) {

        if(url.startsWith("https"))//el metodo " .startWith" es para verificar las primeras palabras
            return "https";
        else if(url.startsWith("http"))
            return "http";
        else
            return "desconocido";
    }

    public static String checkDomainExtension(String url) {

        if(url.endsWith("com"))//el metodo ".endsWith" es para verificar las últimas palbras
            return "com";
        else if (url.endsWith("net"))
            return "net";
        else if (url.endsWith("org"))
            return "org";
        else if (url.endsWith("us"))
            return "us";
        else
            return "desconocido";


}
    }

