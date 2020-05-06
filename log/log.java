public class log {
    // ATOMIC_FUNCTION:  log(val)
    // TAGS: math，numeric
    // LANG:  java
    // FUNCTION: log(val)



    public static void main(String args[]) {
        double start_val = Math.exp(1);
        double expected_end_val = 1;

        double end_val =Math.log(start_val);

        // TEST
        if(end_val == expected_end_val) {
            System.out.println("PASS");
        } else {
            System.out.println("FAIL");
        }
    }
}

