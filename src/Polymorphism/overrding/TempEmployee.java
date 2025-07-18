package Polymorphism.overrding;

public class TempEmployee extends Employee{

    @Override
    void calculatesalary(
    ){
        System.out.println(7500);
    }
    public static void main(String[] args) {
        TempEmployee tempEmployee=new TempEmployee();
        tempEmployee.calculatesalary();
    }
}
