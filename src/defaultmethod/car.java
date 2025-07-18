package defaultmethod;

public class car implements vehicle{
    //abstract method
    public void start() {
        System.out.println("start");
    }

    public static void main(String[] args) {
        car car=new car()   ;
        car.start();
        car.stop();
    }
}
