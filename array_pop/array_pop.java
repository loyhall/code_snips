import java.util.Arrays;

public class array_pop {
    // ATOMIC_FUNCTION:  array_pop(arr)
    // TAGS: array
    // LANG:  java
    // FUNCTION: array_pop(arr)
    public Object[] array_pop(Object[] arr){
        int n=arr.length;
        Object[] result= new Object[n-1];
        System.arraycopy(arr, 0, result, 0, n-1);
        return result;


    }



    public static void main(String args[]) {
        String[] start_val = {"orange", "banana", "apple", "raspberry"};
        String[] expected_end_val={"orange", "banana", "apple"};
        array_pop a= new array_pop();
        Object[] end_val = a.array_pop(start_val);;


        // TEST
        if(Arrays.equals(expected_end_val,end_val)) {
            System.out.println("PASS");
        } else {
            System.out.println("FAIL");
        }
    }

}

