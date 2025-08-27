package bYTEaRRAYiNPUTsTREAM;

import java.io.ByteArrayInputStream;
import java.io.IOException;

public class Method_Read {
    public static void main(String[] args) {
        byte[] array ={1, 2, 3, 4};
    try (ByteArrayInputStream input = new ByteArrayInputStream(array)){
        for (int i = 0; i < array.length; i++) {
            int data = input.read();
            System.out.print(data + ", ");
        }

    }catch (IOException e){
        e.printStackTrace();
    }

    }

}
