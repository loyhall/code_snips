import java.util.regex.Pattern;

public class ltrim {
    private final static Pattern LTRIM = Pattern.compile("^\\s+");

    public static String ltrim(String s) {
        return LTRIM.matcher(s).replaceAll("");
    }
    public static void main(String args[]) {

        // ATOMIC_FUNCTION:  trim($val)
        // TAGS: string
        // LANG:  java
        // FUNCTION: trim($val)

        String start_val = "  abcdefg  ";
        String expected_end_val = "abcdefg  ";
        String end_val = ltrim(start_val);



        // TEST
        if(end_val.equals(expected_end_val)){
            System.out.println("PASS");
        } else {
            System.out.println("FAIL");
        }
    }
}
