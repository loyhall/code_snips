import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class microtime {
    // ATOMIC_FUNCTION:  microtime()
    // TAGS: time
    // LANG:  java
    // FUNCTION:  microtime()
    public static long microtime(){
        return System.currentTimeMillis();
    }
    public static void main(String[] args){
        long start_val=microtime();
        try {
            Thread.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        long end_time=microtime();
        long end_val = end_time-start_val;


        // TEST
        if(end_val>0 && end_val<10) {
            System.out.println("PASS");
        } else {
            System.out.println("FAIL");
        }
    }
}
