package sample;

public class break1 {
    public static void main(String[] args) {
        for(int i=1 ;i<=15; i++) {
           if (i==7){
               break; ///exit  the loop when reach to break point
           //continue; //skip the 7
           }
            System.out.println(i);
            }
        }
}
