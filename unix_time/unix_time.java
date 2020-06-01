import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class unix_time {
    // ATOMIC_FUNCTION:  unix_time()
    // TAGS: time, string
    // LANG:  java
    // FUNCTION:  unix_time()
    public String unix_time(){
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter pattern =
                DateTimeFormatter.ofPattern("yyyy-MM-dd");
        String format = now.format(pattern);

        return format;
    }
    public static void main(String[] args){
        unix_time u = new unix_time();
        String expected_end_val="2020-05-31";

        String end_val= u.unix_time();
        // TEST
        if(end_val.equals(expected_end_val)) {
            System.out.println("PASS");
        } else {

            System.out.println("FAIL");
        }
    }
}
