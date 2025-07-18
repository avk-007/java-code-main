package sample;

public class ThisKeyEmployee {

    public int getExp() {
        return exp;
    }

    public void setExp(int exp) {
        this.exp = exp;   //this.exp is class field
        //this keyboard refers to current instance
        //differenitaite btw instance variable and pararmeters with the same name in setter methods
    }

    public int exp;

    public static void main(String[] args) {
        ThisKeyEmployee employee=new ThisKeyEmployee();
        //emp.exp=10; //not needed bcz we are using setters
        employee.setExp(10);
        System.out.println(employee.exp);

    }
}