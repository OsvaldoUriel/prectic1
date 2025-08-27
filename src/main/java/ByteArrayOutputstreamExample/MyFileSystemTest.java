package ByteArrayOutputstreamExample;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;

public class MyFileSystemTest {
    public static void main(String[] args) throws IOException {
        File_System_Using filesystem = File_System_Using.getFilesystem();
    final String path = "/user/bin/data.txt";

    filesystem.create(path);
    System.out.println("File created successfully");

    try (InputStream inputStream = filesystem.newInputStream(path)){
    System.out.print("File contents:\t");
    System.out.println(read(inputStream));
    }

    try (final OutputStream outputStream= filesystem.newOutputStream(path)){
    outputStream.write("CODEGYM".getBytes(StandardCharsets.UTF_8));
    System.out.println("Data written to file");
    }

    try (InputStream inputStream = filesystem.newInputStream(path)){
    System.out.print("File contents:\t");
    System.out.println(read(inputStream));
    }

    filesystem.delete(path);

    System.out.print("File exists:\t");
    System.out.println(filesystem.isExists(path));

    }

    private static String read(InputStream inputStream) throws IOException{
        return new String(inputStream.readAllBytes(), StandardCharsets.UTF_8);
    }
}