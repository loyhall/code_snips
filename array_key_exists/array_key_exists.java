import java.util.HashMap;

public class array_key_exists {
    // ATOMIC_FUNCTION:  array_key_exists (k,m)
    // TAGS: map
    // LANG:  java
    // FUNCTION:  array_key_exists (k,m)
    public Boolean in_array(Object k, HashMap m){
        return m.containsKey(k);

    }



    public static void main(String args[]) {
        HashMap<Integer, String> start_val_1 = new HashMap<Integer, String>();
        start_val_1.put(10, "Geeks");
        int start_val_2 = 10;
        Boolean expected_end_val=true;
        array_key_exists a= new array_key_exists();

        Boolean end_val = a.in_array(start_val_2,start_val_1);

        // TEST
        if(end_val.equals(expected_end_val)) {
            System.out.println("PASS");
        } else {

            System.out.println("FAIL");
        }
    }
}
