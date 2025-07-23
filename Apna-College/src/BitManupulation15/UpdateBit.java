package BitManupulation15;


import java.util.Scanner;

//update bit
//update the 2nd bit position==1 of a number n to 1(n=0101
// combination of   set to make 1 && of clear to make 0
public class UpdateBit {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int oper = sc.nextInt();
        // oper=1 -> set; oper=0 -> clear
        int n = 5;//0101 --> 0111==>decimal 7 is the aNSWER after entering 1 as ip
        int pos = 1;

        int bitMask = 1<<pos;
        if(oper == 1) {
            //set
            int newNumber = bitMask | n;
            System.out.println(newNumber);
        } else {
            //clear
            int newBitMask = ~(bitMask);
            int newNumber = newBitMask & n;
            System.out.println(newNumber);
        }

    }
}
