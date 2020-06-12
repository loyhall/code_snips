
import java.nio.charset.StandardCharsets;

public class urldecode {
    private static String urldecode(String value) {

        return java.net.URLDecoder.decode(value, StandardCharsets.UTF_8);

    }
    public static void main(String args[]) {
        String start_val ="mycgi%3Ffoo%3D";
        String expected_end_val ="mycgi?foo=";
        String end_val = urldecode(start_val);


        // TEST
        if(end_val.equals( expected_end_val) ){
            System.out.println("PASS");
        } else {
            System.out.println("FAIL");
        }
    }

}
