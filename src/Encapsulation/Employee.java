package Encapsulation;

public class Employee {

    public int getExp() {
        return exp*5;
    }

    public void setExp(int exp) {
        this.exp = exp;
    }

    private int exp;


    public static void main(String[] args) {
        Employee employee=new Employee();
        employee.setExp(10);
        System.out.println(employee.getExp());
    }
}
