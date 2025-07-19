package FunctionandMethods;
import java.util.Scanner;
    public class Multiply {

        public static int MulNo(int a,int b){
            int sum=a*b;
            return sum;
        }

        public static void main(String[] args) {
            Scanner scanner=new Scanner(System.in);
            int a= scanner.nextInt();
            int b= scanner.nextInt();

            int MulNo=MulNo(a,b);
            System.out.println("MulNo is : "+ MulNo);
        }

    }

