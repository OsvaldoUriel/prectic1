package FILE;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadTheExample_1 {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("Ejemplos.txt");
        int byteLeido;
        while ((byteLeido = fis.read()) != -1);{
       System.out.println((char) byteLeido);}

        fis.close();
        }catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
        System.out.println("Error al leer archivo: " + e.getMessage());

        }


    }
}
