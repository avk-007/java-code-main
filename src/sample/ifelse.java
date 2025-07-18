package sample;

public class ifelse {

    public static void main(String[] args) {
/*        int number = 0;

        if (number > 0) {
            System.out.println("positve");
        } else if (number == 10) {
            System.out.println("ten");
        } else if (number < 0) {
            System.out.println("-ve");
        } else {
            System.out.println("zero");
        }*/
//cover all scenarios
        int age =25;
        int height=6;
        if(age>25&&height<5){
            System.out.println("minor");
            System.out.println("short");
        }else if (age>=19&&height>6){
            System.out.println("adult");
            System.out.println("tall");
        }else
        {
            System.out.println("average");
        }
    }
}
