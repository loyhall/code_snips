public class strlen {
    // ATOMIC_FUNCTION:  get_strlen(val)
    // TAGS: string, int
    // LANG:  java
    // FUNCTION: get_strlen(val)
    public int get_strlen(String val){
        return val.length();
    }


    public static void main(String args[]) {
        String start_val = "abcdefg";
        int expected_end_val = 7;
        strlen test = new strlen();
        int end_val = test.get_strlen(start_val);

        // TEST
        if(end_val == expected_end_val) {
            System.out.println("PASS");
        } else {
            System.out.println("FAIL");
        }
    }
}
