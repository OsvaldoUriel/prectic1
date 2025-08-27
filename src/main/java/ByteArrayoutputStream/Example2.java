package ByteArrayoutputStream;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class Example2 {
    public static void main(String[] args) throws IOException {
        ByteArrayOutputStream outputBye = new ByteArrayOutputStream();

        String value = "codaGym";
        outputBye.write(value.getBytes());

        byte[] result = outputBye.toByteArray();
        System.out.println("Result: ");

        for (int i = 0; i < result.length; i++) {
            System.out.println((char) result[i]);
        }


    }

}