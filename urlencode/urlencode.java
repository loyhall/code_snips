import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;

public class urlencode {
    private static String urlencode(String value) {
        try {
            return URLEncoder.encode(value, StandardCharsets.UTF_8.toString());
        } catch (UnsupportedEncodingException ex) {
            throw new RuntimeException(ex.getCause());
        }
    }
    public static void main(String args[]) {
        String start_val = "mycgi?foo=";
        String expected_end_val ="mycgi%3Ffoo%3D";
        String end_val = urlencode(start_val);


        // TEST
        if(end_val.equals( expected_end_val) ){
            System.out.println("PASS");
        } else {
            System.out.println("FAIL");
        }
    }

}
