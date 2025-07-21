package Strings12;

public class CompareTO {
    public static void main(String[] args) {
/*        String s1="abhi";
        String s2="abhi";
        if (s1.equals(s2)){
            System.out.println("coorect");
            }
        else if (s1==s2){
            System.out.println("== correct");
        }
        else if (s1.compareTo(s2)==0){
            System.out.println("==compareTo correct");
        }
        else {
            System.out.println("not equal");;
        }
    }*/

        //substring  parsing
        String sentence ="mynameistony";
       // substring (beg index,end index)
        String name=sentence.substring(0,3);
        System.out.println(name);
    }
}

//strings are Immutable
