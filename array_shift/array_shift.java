import java.util.Arrays;

public class array_shift {
    // ATOMIC_FUNCTION:  array_shift(arr)
    // TAGS: array
    // LANG:  java
    // FUNCTION: array_shift(arr)
    public Object[] array_shift(Object[] arr){
        int n=arr.length;
        Object[] result= new Object[n-1];
        System.arraycopy(arr, 1, result, 0, n-1);
        return result;


    }



    public static void main(String args[]) {
        String[] start_val = {"orange", "banana", "apple", "raspberry"};
        String[] expected_end_val={"banana", "apple", "raspberry"};;
        array_shift a= new array_shift();
        Object[] end_val = a.array_shift(start_val);;


        // TEST
        if(Arrays.equals(expected_end_val,end_val)) {
            System.out.println("PASS");
        } else {
            System.out.println("FAIL");
        }
    }

}
