public class cos {
    // ATOMIC_FUNCTION:  cos(val)
    // TAGS: math，numeric
    // LANG:  java
    // FUNCTION: cos(val)



    public static void main(String args[]) {
        double start_val = 0;
        double expected_end_val = 1;

        double end_val = Math.cos(start_val);
        

        // TEST
        if(end_val == expected_end_val) {
            System.out.println("PASS");
        } else {
            System.out.println("FAIL");
        }
    }
}
