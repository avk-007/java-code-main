package sample;

public class switch1case {

    public static void main(String[] args) {

        int priority=2;
        String result;

        //switch statement
        switch (priority){
            case 1:
                result="high";
                break;
            case 2:
                result="med";
                break;
            default:
                result="low";
                break;
        }
        System.out.println(result);

    }
}
