package OutputStreamExample;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class Example1 {
    public static void main(String[] args) {
        try {
            OutputStream exit = new FileOutputStream("exit.txt");

            String txt = "Hello, I'm writing in a file.";
            byte[] bytes = txt.getBytes();

            exit.write(bytes);
            exit.close();


        }catch (IOException e ){
//            e.printStackTrace();
        System.err.println("An error occurred while writing the file");
        }


    }

}