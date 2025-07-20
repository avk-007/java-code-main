package Arrays10;

import java.util.Arrays;

/*o,1,2,3 index in squqare brackets*/
public class Basic {
    public static void main(String[] args) {
        int[] marks=new int[3];
/*        int[] marks2=new int[30];
        int[] numbers={97,65,99};*/
        marks[0]=97;
        marks[1]=90;
        marks[2]=65;

//        System.out.println(marks[0]);
//        System.out.println(marks[1]);
//        System.out.println(marks[2]);
//        System.out.println(marks.length);
//        System.out.println(Arrays.stream(marks).average());


        for(int i=0;i<3;i++){
            System.out.println(marks[i]);
        }
    }
}
