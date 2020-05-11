
import java.util.Arrays;

public class explode {
    // ATOMIC_FUNCTION:  explode (delimiter,string)
    // TAGS: string,list
    // LANG:  java
    // FUNCTION: explode (delimiter,string)
    public String[] explode (String delimiter,String string){
        return string.split(delimiter);
    }


    public static void main(String args[]) {
        String start_val = "piece1 piece2 piece3 piece4 piece5 piece6";
        String[] expected_end_val = {"piece1","piece2","piece3","piece4","piece5","piece6"};
        explode e  = new explode();
        String[] end_val = e.explode(" ",start_val);

        // TEST
        if(Arrays.equals(end_val,expected_end_val)) {
            System.out.println("PASS");
        } else {

            System.out.println("FAIL");
        }
    }
}
