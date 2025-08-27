package FILE;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Copy_a_file_binario {
    public static void main(String[] args) {
        try {
            FileOutputStream fos = new FileOutputStream("copia.jpg");
            FileInputStream fis =  new FileInputStream("origen.jpg");
        byte[] buffer = new byte[1024];
        int bytesLeidos;

        while ((bytesLeidos = fis.read(buffer)) != -1){
            fos.write(buffer, 0 , bytesLeidos);
        }
        fis.close();
        fos.close();

        System.out.println("Archivo copiado correctamente");
        } catch (FileNotFoundException e) {
            System.out.println("Error: " + e.getMessage());

            throw new RuntimeException(e);
        } catch (IOException e) {
        System.out.println("Error 2: " + e.getMessage());
        }


    }
}
