package ByteArrayoutputStream;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class Example3reset {
    public static void main(String[] args) throws IOException {

        ByteArrayOutputStream outputByte = new ByteArrayOutputStream();

        String value = "codeGym";
        outputByte.write(value.getBytes());
        byte[] result = outputByte.toByteArray();
        System.out.println("Output before reset: ");

        for (byte b : result) {
            System.out.println((char) b);
        }

        outputByte.reset();

        byte[] resultAfterReset = outputByte.toByteArray();
        System.out.println("\nOutput after reset: ");

        for (byte b : resultAfterReset) {
            System.out.println((char) b);
        }


    }

}