package ByteArrayOutputstreamExample;

import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Example1 {
    public static void main(String[] args)throws IOException {
        ByteArrayOutputStream output = new ByteArrayOutputStream();

        while (output.size() != 7){
            output.write("codegym".getBytes());
        }

        String value = "\nWelcome to java\n";
        byte[] arrByte = value.getBytes();
        output.write(arrByte);


        String codeGym = "CodeGym";
        byte[] b = codeGym.getBytes();
        output.write(b, 4, 3);

        FileOutputStream fileOutputStream = new FileOutputStream("output.txt");
        output.write(80);
//        output.write(fileOutputStream);
        

    }
}