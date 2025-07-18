package Super;

public class subclass extends SuperClass{

    public subclass() {
        super(); //optional to write-automatically placed
        System.out.println("from subclass");
    }

    public static void main(String[] args) {
        //creating object of subclass
        subclass subclass=new subclass();
    }
}
