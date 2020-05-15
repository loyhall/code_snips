import java.util.Arrays;

public class in_array {
    // ATOMIC_FUNCTION:  in_array(value,arr)
    // TAGS: string,list
    // LANG:  java
    // FUNCTION: in_array(value,arr)
    public Boolean in_array(Object value,Object[] arr){
        return Arrays.asList(arr).contains(value);

    }



    public static void main(String args[]) {
        String[] start_val_1 = {"hello","world"};
        String start_val_2 = "hello";
        Boolean expected_end_val=true;
        in_array a= new in_array();

        Boolean end_val = a.in_array(start_val_2,start_val_1);

        // TEST
        if(end_val.equals(expected_end_val)) {
            System.out.println("PASS");
        } else {

            System.out.println("FAIL");
        }
    }
}
