package sample;

public class foreach {
    public static void main(String[] args) {
        int [] numbers={1,2,3,4,5,6};

        //for each
        for(int number :numbers){
            System.out.println(number);
        }

        // tradtional normal for loop
/*        for(int i=0;i<numbers.length;i++){
            int number=numbers[i];
            System.out.println(number);

        }*/

    }
}
