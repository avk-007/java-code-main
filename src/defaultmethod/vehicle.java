package defaultmethod;

public interface vehicle {
//abstraxct method
    void start();

    //default method
    default void stop(){
        System.out.println("stopp");
    }
}
//yes abstract class have constructors wwhen chil class is created then before executing constrcutor of parent class will be created
//interface do not havew constructor
//2 ways to achiove abstraction 1.by interefcae and 2. by absrtract class.