

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class FiletoString {
    // ATOMIC_FUNCTION:  filetostring(String path)
    // TAGS: file, string
    // LANG:  java
    // FUNCTION:  filetostring(String path)
    public String filetostring(String path){
        StringBuilder contentBuilder = new StringBuilder();
        try (Stream<String> stream = Files.lines( Paths.get(path), StandardCharsets.UTF_8))
        {
            stream.forEach(s -> contentBuilder.append(s));
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        return contentBuilder.toString();
    }
    public static void main(String[] args){
        String start_val="test.txt";
        String expected_end_val="hello world";
        FiletoString f =new FiletoString();
        String end_val= f.filetostring(start_val);
        // TEST
        if(end_val.equals(expected_end_val)) {
            System.out.println("PASS");
        } else {
           
            System.out.println("FAIL");
        }
        }
}


