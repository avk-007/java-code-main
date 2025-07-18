package inheritance;

public class Employee {
    private int exp;
    public int getExp() {
        return exp;
    }

    public void setExp(int exp) {
        this.exp = exp;
    }

    public double calcsalary(){
        int salary=exp*5000;

        return salary;
    }

}
