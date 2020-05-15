public class implode {
    // ATOMIC_FUNCTION:  implode (delimiter,list)
    // TAGS: string,list
    // LANG:  java
    // FUNCTION: implode (delimiter,list)
    public String implode (String delimiter,String[] list){
        return String.join(delimiter,list);
    }


    public static void main(String args[]) {
        String[] start_val = {"hello","world"};
        String expected_end_val = "hello world";
        implode e  = new implode();
        String end_val = e.implode(" ",start_val);

        // TEST
        if(end_val.equals(expected_end_val)) {
            System.out.println("PASS");
        } else {

            System.out.println("FAIL");
        }
    }
}
