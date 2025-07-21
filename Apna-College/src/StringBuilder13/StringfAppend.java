package StringBuilder13;
/*NOTES
* Strings are immutable so make String mutable we are using StringBuilder.
* when we create StringBuilder in heap memory to hello object
*  The append method adds text to the same object, making it faster and more memory efficient for repeated changes.
When to Use Each
* Use String when your text doesn’t change often.
Use StringBuilder for tasks like loops with repeated concatenation or any situation requiring lots of modifications to a string.*/
public class StringfAppend {
    public static void main(String[] args) {
        StringBuilder sB=new StringBuilder("abhi");
        System.out.println(sB);
        String str="shek";
        System.out.println(sB.append(str));

        //char At
        System.out.println(sB.charAt(0));

        //set chat at index 0
        sB.setCharAt(0,'P');
        System.out.println(sB);

        //length addition
        sB.setLength(10);
        System.out.println(sB);

        sB.insert(3,'S');
        System.out.println(sB);
       //delete chaAT
        sB.deleteCharAt(0);
        System.out.println(sB);

        //delete the char
        sB.delete(9,10);
        System.out.println(sB);
    }
}
