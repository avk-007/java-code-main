package Strings13;

public class Concatenation {
    public static void main(String[] args) {
        String firstname = "abhishek";
        String lastname = "kumar";
        String fullname=firstname+lastname;
//        System.out.println(fullname);
//    }

        //length of a String
        System.out.println(firstname.length()+" "+ lastname.length());
        System.out.println(fullname.length());
//        System.out.println(fullname.charAt(3));
//        System.out.println(fullname.charAt(9));
   // }

    //charat
    for(int i=0;i<fullname.length();i++){
        System.out.println(fullname.charAt(i));
    }
    }
}
