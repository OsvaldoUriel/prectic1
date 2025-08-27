package ExamplesInputStream;

import java.io.*;

public class ReadFromConsole {
    public static void main(String[] args) throws IOException {

        InputStream in = System.in;
        InputStreamReader isr = new InputStreamReader(in);
        BufferedReader br = new BufferedReader(isr);

        System.out.println("Write something");
        String txt = br.readLine();
        System.out.println("You read: " + txt);


    }
}
