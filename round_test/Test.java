public class Test {
    public static void main(String args[]){
        //Function:round
        //Lang:java

        double start_val=1.2;
        double expected_end_val=1;
        double end_val=Math.round(start_val);

        //TEST
        if(end_val==expected_end_val){
            System.out.println("PASS");
        }
        else{
            System.out.println("FAIL");
        }

        
    }
}
