package ExamplesInputStream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Tab_2 {
    public static void main(String[] args) {
        String nombreArchivo = "FileTable.txt";
        String copyfile = "filetac_copy_txt";


 try {
     FileOutputStream fos = new FileOutputStream(nombreArchivo);
     String txt = "HI wold from FileOutput\nThis is the second line.";
     fos.write(txt.getBytes());
     fos.close();
     System.out.println("written file: " + nombreArchivo);

     FileInputStream fis = new FileInputStream(nombreArchivo);
     System.out.println("\nFile content");
    int data;
    while ((data = fis.read()) != -1){
        System.out.println((char) data);
     }
    fis.close();

    FileInputStream fis2 = new FileInputStream(nombreArchivo);
    FileOutputStream fos2 = new FileOutputStream(copyfile);

    byte[] buffer = new byte[1024];
    int bytesLeidos;
    while ((bytesLeidos = fis2.read(buffer)) != -1){
        fos2.write(buffer, 0, bytesLeidos);
    }

    fis2.close();
    fos2.close();
    System.out.println("\n\nArchivo copiado como: " + copyfile);

 }catch (IOException e){
System.out.println("Error: " + e.getMessage());
 }


    }

}