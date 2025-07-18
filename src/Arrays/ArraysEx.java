package Arrays;

public class ArraysEx {
    public static void main(String[] args) {
        String []fruits={"apple","banna","lemon"}; //declar and initiaze a rraya of strings

        //access one element by passing index
        System.out.println(fruits[1]); // lemon
        System.out.println(fruits.length); // 3

        //for acces all the fruits use loops to iterate over array
        for(int i=0;i<fruits.length;i++)
        System.out.println(fruits[i]);
    }
}
