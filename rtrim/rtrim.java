import java.util.regex.Pattern;

public class rtrim {
    private final static Pattern RTRIM = Pattern.compile("\\s+$");

    public static String rtrim(String s) {
        return RTRIM.matcher(s).replaceAll("");
    }
    public static void main(String args[]) {

        // ATOMIC_FUNCTION:  trim($val)
        // LANG:  java
        // FUNCTION: trim($val)

        String start_val = "  abcdefg  ";
        String expected_end_val = "  abcdefg";
        String end_val = rtrim(start_val);



        // TEST
        if(end_val.equals(expected_end_val)){
            System.out.println("PASS");
        } else {
            System.out.println("FAIL");
        }
    }
}
