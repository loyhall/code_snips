public class exp {
    // ATOMIC_FUNCTION:  exp(val)
    // TAGS: math，numeric
    // LANG:  java
    // FUNCTION: exp(val)



    public static void main(String args[]) {
        double start_val = Math.log(1);
        double expected_end_val = 1;

        double end_val =Math.exp(start_val);

        // TEST
        if(end_val == expected_end_val) {
            System.out.println("PASS");
        } else {
            System.out.println("FAIL");
        }
    }
}

