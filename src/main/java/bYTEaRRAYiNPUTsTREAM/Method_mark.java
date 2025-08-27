package bYTEaRRAYiNPUTsTREAM;

import java.io.ByteArrayInputStream;
import java.io.IOException;

public class Method_mark {
    public static void main(String[] args) {
byte[] buff = {65, 66, 67, 68, 69};

try(ByteArrayInputStream bais = new ByteArrayInputStream(buff)){
    boolean isMarkSupported = bais.markSupported();

    System.out.println("isMarkSupported: " + isMarkSupported);
    System.out.println("Read: " + bais.read());
    System.out.println("Read: " + bais.read());

    bais.mark(1);
    System.out.println("Read: " + bais.read());
    isMarkSupported = bais.markSupported();
    System.out.println("isMarkSupported: " + isMarkSupported);

//    System.out.println("Calling reset() method");
    bais.reset();
    isMarkSupported = bais.markSupported();
    System.out.println("isMarkSupported: " + isMarkSupported);


}catch (IOException e){
    e.printStackTrace();
}
    }

public boolean markSupported(){
 return true;
    }

}
