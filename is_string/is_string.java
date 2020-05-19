public class is_string {
    // ATOMIC_FUNCTION:  is_string(s)
    // TAGS: string,boolean
    // LANG:  java
    // FUNCTION: is_string(s)
    public Boolean is_string(Object o){
        return (o instanceof String);
    }

    public static void main(String args[]) {

        String start_val = "HELLO";
        Boolean expected_end_val = true;
        is_string a = new is_string();
        Boolean end_val = a.is_string(start_val);

        // TEST
        if(end_val.equals(expected_end_val)) {
            System.out.println("PASS");
        } else {

            System.out.println("FAIL");
        }
    }
}
