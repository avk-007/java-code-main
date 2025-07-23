package BitManupulation15;
//steps 1&2
//BITMASK 1<<i
//  Operation AND WITH NOT
public class ClearBit {

    public static void main(String[] args) {
        //1-bitmask 1<<2 =0001<<2==0100 is bitmask
        //2- 0100 to 1011 ==>> 0001

        int no=5;
        int pos=2;

        int bitmask=1<<pos;
        int notBitmask=~(bitmask);

//Operation AND WITH NOT
        int  newNumber=notBitmask & no;
        System.out.println(newNumber);

    }
}
