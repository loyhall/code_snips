public class strtolower {
    // ATOMIC_FUNCTION:  strtolower(s)
    // TAGS: string
    // LANG:  java
    // FUNCTION: strtolower(s)
    public String strtolower(String s){
        return s.toLowerCase();
    }

    public static void main(String args[]) {

        String start_val = "HELLO";
        String expected_end_val = "hello";
        strtolower a = new strtolower();
        String end_val = a.strtolower(start_val);

        // TEST
        if(end_val.equals(expected_end_val)) {
            System.out.println("PASS");
        } else {

            System.out.println("FAIL");
        }
    }
}
