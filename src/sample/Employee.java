package sample;

public class Employee {
    private int exp; //field

    public void setExp(int exp) {
        this.exp = exp;
    }

    public int getExp(){
        return exp;
    }


    public Employee() {
    }

    public double calculateSalary(){
        int salary=exp*5000;
        return salary;
    }

    public static void main(String[] args) {
//        crete emp object empty object
        Employee emp=new Employee();
      //  emp.exp=5;
        emp.setExp(5);
        double salary = emp.calculateSalary();
//        System.out.println(salary);
        System.out.println(emp.getExp());


    }
}