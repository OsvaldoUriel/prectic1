package bYTEaRRAYiNPUTsTREAM;

import java.io.ByteArrayInputStream;
import java.io.IOException;

public class Method_skip {
    public static void main(String[] args) {
        byte [] array = {1, 2, 3, 4};

        try (ByteArrayInputStream input = new ByteArrayInputStream(array)){
            input.skip(2);

        while (input.available() != 0){
            int data = input.read();
            System.out.println(data + ", ");
            }
        }catch (IOException e){
            e.printStackTrace();
        }


    }
}
