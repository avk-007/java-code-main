package accessifier;

public class ScienceStudent {
    public void GetStudent(){
        Student student=new Student();
        System.out.println(student.name); //public
        System.out.println(student.age); //default no error
        System.out.println(student.city); //private error
    }
}
