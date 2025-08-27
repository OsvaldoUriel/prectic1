package bYTEaRRAYiNPUTsTREAM;

import java.io.ByteArrayInputStream;
import java.io.IOException;

public class Method_available {
    public static void main(String[] args) {
    byte[] array = {1, 2, 3, 4};

    try (ByteArrayInputStream input = new ByteArrayInputStream(array)){
        System.out.println("Bytes available for reading: " + input.available());

        input.read();
        System.out.println("Bytes available for reading: " + input.available());

        input.read();
        System.out.println("Bytes available for reading: " + input.available());
    }catch (IOException e){
        e.printStackTrace();
    }

    }

}
