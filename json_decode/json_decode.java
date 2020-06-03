import com.google.gson.Gson;

import java.util.HashMap;

public class json_decode {
    // ATOMIC_FUNCTION:  json_decode(String x)
    // TAGS: json
    // LANG:  java
    // FUNCTION: json_decode(String x)
    public String json_decode(String x){
        Gson gson = new Gson();
        return  gson.fromJson(x,String.class);
    }
    public static void main(String[] args){
        String start_val= "String";
        json_decode j = new json_decode();
        String expected_end_val="String";
        String end_val = j.json_decode(start_val);

        // TEST
        if(end_val.equals(expected_end_val)) {
            System.out.println("PASS");
        } else {

            System.out.println("FAIL");
        }
    }
}
