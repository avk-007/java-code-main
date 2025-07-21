package StringBuilder13;

public class ReverseString {
    public static void main(String[] args) {
        // Using String concatenation
        String original = "abhishek";
        String reversed = "";

        for(int i=original.length()-1;i>=0;i--){
            reversed +=original.charAt(i);
        }
        System.out.println(reversed);


        // Using StringBuilder
        String original1 = "Hello";
        String original2 = "123";
        StringBuilder sb = new StringBuilder(original1);
        StringBuilder sb2 = new StringBuilder(original2);
        sb.reverse();
        sb2.reverse();
        System.out.println(sb.toString()); // Output: "olleH"
        System.out.println(sb2.toString()); // Output: "321"

        //using Stringbuilder tougher apparaoch
        //Tc =O(n)
        StringBuilder tougher = new StringBuilder("HelloWorld");
        for(int i=0; i<tougher.length()/2; i++) {
            int front = i;
            int back = tougher.length() - i - 1;

            char frontChar = tougher.charAt(front);
            char backChar = tougher.charAt(back);

            tougher.setCharAt(front, backChar);
            tougher.setCharAt(back, frontChar);
        }
        System.out.println(tougher);
    }
}
