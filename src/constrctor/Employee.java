package constrctor;

//ex for parameterised constructor
 public class Employee {
public String name;

//parameterised constructor
    public Employee(String name) {
        this.name=name; //field initialization
    }
    public String getName(){
        return  name;
    }

    public static void main(String[] args) {
        Employee employee=new Employee("abhishek");
        System.out.println(employee.getName());
    }
}
