package BitManupulation15;

/*Bit Manipulation
 */
public class BitManupulation {
    //    Get Bit
//get the 3rd bit at position 2 of a number n .
    //& (n=0101)
    //bit mask is a process :: bit mask 1<<i & opeartion : AND
    //bit mask so 1<<2 ,,ooo1<<2,0100 and step 2 perform operation : 01000 AND 0101 ==> 0100
    public static void main(String[] args) {

        int n = 5;
        int pos = 2;
        int bitmask = 1 << pos;
        if ((bitmask & n) == 0) {
            System.out.println("bit was zero");

        } else {
            System.out.println("bit was one");

        }

    }


}

