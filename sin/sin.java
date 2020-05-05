public class sin {
    // ATOMIC_FUNCTION:  sin(val)
    // TAGS: math，numeric
    // LANG:  java
    // FUNCTION: sin(val)



    public static void main(String args[]) {
        double start_val = Math.PI/2;
        double expected_end_val = 1;

        double end_val = Math.sin(start_val);
        

        // TEST
        if(end_val == expected_end_val) {
            System.out.println("PASS");
        } else {
            System.out.println("FAIL");
        }
    }
}
