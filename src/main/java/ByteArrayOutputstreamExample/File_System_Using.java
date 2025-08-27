package ByteArrayOutputstreamExample;

import javax.swing.*;
import java.io.*;
import java.nio.file.FileSystem;
import java.util.HashMap;
import java.util.Map;

public class File_System_Using {
 private static final File_System_Using filesystem = new File_System_Using();
 private static final Map<String, byte[]> files = new HashMap<>();

 private File_System_Using(){
 }

 public static File_System_Using getFilesystem(){
     return filesystem;
 }

 public void create(String path){
     validateNotExists(path);
     files.put(path, new byte[0]);
 }

 public void delete(String path){
     validateExists(path);
     files.remove(path);
 }

 public boolean isExists(String path){
     return files.containsKey(path);
 }

    public InputStream newInputStream(String path){
     validateExists(path);
     return new ByteArrayInputStream(files.get(path));
 }

 public OutputStream newOutputStream(String path) {
     validateExists(path);
     return new ByteArrayOutputStream() {
         @Override
         public void flush() throws IOException {
             final byte[] bytes = toByteArray();
             files.put(path, bytes);
             super.flush();
         }

         @Override
         public void close() throws IOException {
             final byte[] bytes = toByteArray();
             files.put(path, bytes);
             super.close();
         }
     };
 }

 private void validateExists(String path){
if (!files.containsKey(path)){
 throw new RuntimeException("File not found") ;
}
 }

 private void validateNotExists(String path){
     if (files.containsKey(path)){
         throw new RuntimeException("File exists");
     }
 }

}