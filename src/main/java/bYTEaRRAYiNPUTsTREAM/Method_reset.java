package bYTEaRRAYiNPUTsTREAM;

import java.io.ByteArrayInputStream;
import java.io.IOException;

public class Method_reset {
    public static void main(String[] args) {
        byte[] buff = {65, 66, 67 ,68, 69};

        try (ByteArrayInputStream input = new ByteArrayInputStream(buff)){
            System.out.println("Read: " + input.read());
            System.out.println("Read: " + input.read());
            System.out.println("Read: " + input.read());
            System.out.println("Read: " + input.read());

            System.out.println("Calling reset() method");
            input.reset();
            System.out.println("Read: " + input.read());
            System.out.println("Read: " + input.read());
        }catch (IOException e){
            e.printStackTrace();
        }

    }

}
