package Exception;

public class Exceptionex {

    public static void main(String[] args) {
        try{
            int[] no={1,2,4};
            System.out.println(no[3]);
            System.out.println("end");
        }
        catch (Exception e){
            //handling exception
            System.err.println("error"+e.getMessage());
        }
        //finally used to cleanup or closing connection or logging
        System.out.println("finally block run");
    }
}
