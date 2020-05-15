public class is_array {
    // ATOMIC_FUNCTION:  isArray()
    // TAGS: string,list
    // LANG:  java
    // FUNCTION: isArray()



    public static void main(String args[]) {
        String[] start_val = {"hello","world"};
        Boolean expected_end_val=true;

        Boolean end_val = start_val.getClass().isArray();

        // TEST
        if(end_val.equals(expected_end_val)) {
            System.out.println("PASS");
        } else {

            System.out.println("FAIL");
        }
    }
}
