package ByteArrayoutputStream;

import java.io.ByteArrayOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.reflect.Field;

public class example1 {
    public static void main(String[] args) throws IOException {
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();

        while(outputStream.size() != 7){
            outputStream.write("code.gym".getBytes());
        }

        String value = "\nWelcome to Java\n";
        byte[] arrByte = value.getBytes();
        outputStream.write(arrByte);


        String codeGym = "codeGym";
        byte[] b = codeGym.getBytes();
        outputStream.write(b, 4, 3);

        FileOutputStream fileOutputStream = new FileOutputStream("output.txt");
        outputStream.write(80);
        outputStream.writeTo(fileOutputStream);

    }

}