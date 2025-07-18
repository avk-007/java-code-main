package Exception;

public class multiple {

    public static void main(String[] args) {
        try{
            int[] no={1,2,4};
            System.out.println(no[3]);
            System.out.println("end");
        }
        catch (ArrayIndexOutOfBoundsException e){
            //handling exception
            System.err.println("error"+e.getMessage());
        }
        catch (NullPointerException e){
            //handling exception
            System.err.println("error"+e.getMessage());
        }
        //catch: all catch  we cannot execute at one time
        catch (Exception e){
            System.err.println("errorr"+e.getMessage());
        }

    }
}
