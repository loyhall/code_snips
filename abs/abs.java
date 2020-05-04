public class abs {
    // ATOMIC_FUNCTION:  abs(val)
    // TAGS: math，numeric
    // LANG:  java
    // FUNCTION: abs(val)



    public static void main(String args[]) {
        double start_val = -1.2;
        double expected_end_val = 1.2;

        double end_val = Math.abs(start_val);

        // TEST
        if(end_val == expected_end_val) {
            System.out.println("PASS");
        } else {
            System.out.println("FAIL");
        }
    }
}

