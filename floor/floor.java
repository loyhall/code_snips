public class floor {
    // ATOMIC_FUNCTION:  floor(val)
    // TAGS: math，numeric
    // LANG:  java
    // FUNCTION: floor(val)



    public static void main(String args[]) {
        double start_val = 1.2;
        double expected_end_val = 1;

        double end_val = Math.floor(start_val);

        // TEST
        if(end_val == expected_end_val) {
            System.out.println("PASS");
        } else {
            System.out.println("FAIL");
        }
    }
}

