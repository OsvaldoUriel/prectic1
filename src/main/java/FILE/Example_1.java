package FILE;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Example_1 {
    public static void main(String[] args)  {
        try {
            FileOutputStream fos = new FileOutputStream("Ejemplos.txt");
        String texto = "Hello world from FileOutputStream";
        fos.write(texto.getBytes());

        fos.close();
System.out.println("Archivo escrito correctamente");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            System.out.println("Error al escribir el archivo: " + e.getMessage());
//            throw new RuntimeException(e);
        }


    }
}
