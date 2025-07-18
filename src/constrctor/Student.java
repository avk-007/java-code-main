package constrctor;
//copy constrctuor for clone behaviors

public class Student {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String name;

    //parameterized constructors
    public Student(String name){
        this.name=name;
    }

    //copy constructor
    public Student(Student otherName){
        this.name=otherName.name;
    }

    public static void main(String[] args) {
        Student student1=new Student("abhi");
        //craete object for stuydent 2 as copyu of stud object
        Student student2=new Student(student1);
        System.out.println(student1.getName());
        System.out.println(student2.getName());


    }
}

//constructor do not have return type.

//ques:what will happen if no constructor is defined in the class
//ans/ java will provide default constructor
