import com.google.gson.Gson;

import java.util.HashMap;

public class json_encode {
    // ATOMIC_FUNCTION:  json_encode(Object x)
    // TAGS: json
    // LANG:  java
    // FUNCTION: json_encode(Object x)
    public String json_encode(Object x){
        Gson gson = new Gson();
        return  gson.toJson(x);
    }
    public static void main(String[] args){
        HashMap<String, Integer> start_val= new HashMap<>();
        start_val.put("atomic",1);
        json_encode j = new json_encode();
        String expected_end_val="{\"atomic\":1}";
        String end_val = j.json_encode(start_val);

        // TEST
        if(end_val.equals(expected_end_val)) {
            System.out.println("PASS");
        } else {

            System.out.println("FAIL");
        }
    }

}
