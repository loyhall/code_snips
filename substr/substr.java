public class substr {
    // ATOMIC_FUNCTION:  get_substr($val, $start, $length)
    // TAGS: string
    // LANG:  java
    // FUNCTION: get_substr($val, $start, $length)
    public String get_substr(String val,int start, int length){
        return val.substring(start,start+length);
    }


    public static void main(String args[]) {
        String start_val = "abcdefg";
        String expected_end_val = "bcd";
        int start = 1;
        int length = 3;

        substr test = new substr();
        String end_val = test.get_substr(start_val,start,length);

        // TEST
        if(end_val.equals(expected_end_val)) {
            System.out.println("PASS");
        } else {

            System.out.println("FAIL");
        }
    }
}
