public class str_word_count {
    // ATOMIC_FUNCTION:  str_word_count(String s)
    // TAGS: string,int
    // LANG:  java
    // FUNCTION: str_word_count(String s)
    public int str_word_count(String s){
        return s.split(" ").length;
    }


    public static void main(String args[]) {
        String start_val = "hello world";
        int expected_end_val = 2;
        str_word_count e =new str_word_count();
        int  end_val = e.str_word_count(start_val);

        // TEST
        if(end_val== expected_end_val) {
            System.out.println("PASS");
        } else {

            System.out.println("FAIL");
        }
    }
}
