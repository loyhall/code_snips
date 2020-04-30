public class trim {

    public static void main(String args[]) {

        // ATOMIC_FUNCTION:  trim($val)
        // LANG:  java
        // FUNCTION: trim($val)

        String start_val = "  abcdefg  ";
        String expected_end_val = "abcdefg";
        String end_val = start_val.trim();



        // TEST
        if(end_val.equals(expected_end_val)){
            System.out.println("PASS");
        } else {
            System.out.println("FAIL");
        }
    }
}
