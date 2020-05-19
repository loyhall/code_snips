import java.lang.reflect.Array;
import java.util.Arrays;

public class array_merge {
    // ATOMIC_FUNCTION:  array_merge(T a, T b)
    // TAGS: list
    // LANG:  java
    // FUNCTION: array_merge(T a, T b)
    public static <T> T array_merge(T a, T b) {
        if (!a.getClass().isArray() || !b.getClass().isArray()) {
            throw new IllegalArgumentException();
        }

        Class<?> resCompType;
        Class<?> aCompType = a.getClass().getComponentType();
        Class<?> bCompType = b.getClass().getComponentType();

        if (aCompType.isAssignableFrom(bCompType)) {
            resCompType = aCompType;
        } else if (bCompType.isAssignableFrom(aCompType)) {
            resCompType = bCompType;
        } else {
            throw new IllegalArgumentException();
        }

        int aLen = Array.getLength(a);
        int bLen = Array.getLength(b);

        @SuppressWarnings("unchecked")
        T result = (T) Array.newInstance(resCompType, aLen + bLen);
        System.arraycopy(a, 0, result, 0, aLen);
        System.arraycopy(b, 0, result, aLen, bLen);

        return result;
    }
    public static void main(String args[]) {
        String[] start_val_1 = {"hello","world"};
        String[] start_val_2 = {"atomic"};
        String[] expected_end_val={"hello","world","atomic"};
        array_merge a= new array_merge();

        String[] end_val = a.array_merge(start_val_1,start_val_2);

        // TEST
        if(Arrays.equals(end_val,expected_end_val)) {
            System.out.println("PASS");
        } else {
            System.out.println("FAIL");
        }
    }

}
