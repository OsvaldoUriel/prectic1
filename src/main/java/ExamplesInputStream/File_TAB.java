package ExamplesInputStream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class File_TAB {
    public static void main(String[] args) {

            try {
                FileOutputStream fos = new FileOutputStream("FileTable.txt");

                String txt = "Hi wold from FileOutputStream";
                fos.close();

                System.out.println("writing file correctly");
            } catch (IOException e) {
            System.out.println("error writing file " + e.getMessage());
            }


    }

}