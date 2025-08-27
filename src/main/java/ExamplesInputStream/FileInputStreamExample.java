package ExamplesInputStream;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class FileInputStreamExample {
    public static void main(String[] args) {
        try{
            InputStream input = new FileInputStream("archivo.txt");

            int data;
            while ((data = input.read()) != -1){
                System.out.println((char) data);
            }

            input.close();
        }catch (IOException e){
        e.printStackTrace();
        }


    }
}
