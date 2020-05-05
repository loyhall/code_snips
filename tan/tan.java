public class tan {
    // ATOMIC_FUNCTION:  tan(val)
    // TAGS: math，numeric
    // LANG:  java
    // FUNCTION: tan(val)



    public static void main(String args[]) {
        double start_val = 0;
        double expected_end_val = 0;

        double end_val = Math.tan(start_val);
        

        // TEST
        if(end_val == expected_end_val) {
            System.out.println("PASS");
        } else {
            System.out.println("FAIL");
        }
    }
}
