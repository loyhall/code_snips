import java.math.BigInteger;
import java.security.MessageDigest;

public class md5 {
    // ATOMIC_FUNCTION:  md5(String s)
    // TAGS: string
    // LANG:  java
    // FUNCTION: md5(String s)
    public String  md5(String x){
        try{
            String plaintext = "your text here";
            MessageDigest m = MessageDigest.getInstance("MD5");
            m.reset();
            m.update(plaintext.getBytes());
            byte[] digest = m.digest();
            BigInteger bigInt = new BigInteger(1,digest);
            String hashtext = bigInt.toString(16);
            return hashtext;
        }catch(Exception e) {
            // do proper exception handling
            return null;
        }


    }
    public static void main(String args[]) {
        String start_val = "apple";
        String expected_end_val ="3b777055f53f39be20ba812d5cec7621";
        md5 m = new md5();

        String end_val = m.md5(start_val);


        // TEST
        if(end_val.equals( expected_end_val) ){
            System.out.println("PASS");
        } else {

            System.out.println("FAIL");
        }
    }

}
