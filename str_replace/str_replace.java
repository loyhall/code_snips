public class str_replace {
    // ATOMIC_FUNCTION:  replaceAll(old,new)
    // TAGS: string
    // LANG:  java
    // FUNCTION: replaceAll(old,new)

    public static void main(String args[]) {
        String start_val = "<body text='%body%'>";
        String expected_end_val = "<body text='black'>";
        String end_val = start_val.replaceAll("%body%", "black");

        // TEST
        if(end_val.equals(expected_end_val)) {
            System.out.println("PASS");
        } else {

            System.out.println("FAIL");
        }
    }
}
