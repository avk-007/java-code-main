package sample;

public class oopsEmployee {
    private int exp;


    public oopsEmployee() {
    }

    public  double calcuteSalary(){
        int salary=exp*5000;
        return salary;
    }

    public static void main(String[] args) {
        oopsEmployee emp=new oopsEmployee();
        emp.exp=5;
        double salary= emp.calcuteSalary();
        System.out.println(salary);
    }
}
