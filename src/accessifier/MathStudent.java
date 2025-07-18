package accessifier;

public class MathStudent {

    public void GetStudent(){
        Student student=new Student();
        System.out.println(student.name); //public
        System.out.println(student.age); //
        System.out.println(student.city); //private error
    }
}
