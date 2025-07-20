package Arrays10;

import java.util.Scanner;

public class SearchForX {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int size=scanner.nextInt(); //array size
        int numbers[]=new int[size];

        //input
        for(int  i=0;i<size;i++){
            numbers[i]  = scanner.nextInt();

        }

        int x=scanner.nextInt();
//op
        for (int i=0;i<numbers.length;i++){
            if(numbers[i]==x){
                System.out.println("found at index :" +i);
            }
    }
}}
/* this is called linear search -straight search..
4:size
1
3
5
9
search:3
found at index :1*/