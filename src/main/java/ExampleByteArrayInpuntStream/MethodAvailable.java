package ExampleByteArrayInpuntStream;

import java.io.ByteArrayInputStream;
import java.io.IOException;

public class MethodAvailable {
    public static void main(String[] args) {
        byte [] array = {1, 2, 3, 4};

        try (ByteArrayInputStream input = new ByteArrayInputStream(array)){
            System.out.println("Byte available for reading: " + input.available());

            input.read();
            System.out.println("Byte available for reading: " + input.available());

            input.read();
            System.out.println("Byte available for reading: " + input.available());


        }catch (IOException e){
            e.printStackTrace();
        }

        
    }
}
