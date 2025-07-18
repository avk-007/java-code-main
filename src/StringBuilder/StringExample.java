package StringBuilder;

public class StringExample {

    public static void main(String[] args) {
        String s1 = "Interview";
        String s2 = new String("happy");

        //length
        int length=s1.length();
        System.out.println(length);

        //concatenation
        String result=s1.concat(","+ s2);
        System.out.println(result);

        //substring retriives substring from index 5 to 9
        String substring=result.substring(5,9);
        System.out.println(substring);

        String substring1=result.toLowerCase();
        System.out.println(substring1);


        //find index
        int index=result.indexOf("h");
        System.out.println(index);

        //equality=check if string are equal or not
        boolean isequal=s1.equals(s2);
        System.out.println(isequal);
    }

}
