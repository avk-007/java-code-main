package sample;

/*advanatages
    1.setter methods can include validation logic to ensure that the assigned value are valid
    2.data acces /;getters can control how field is accesed
    3.encaplusatatiion/abastraction :getter and setters methods hide the implementation details of class
      and expose only neccesary infos
* */

public class ThisKeyEmployeeWIthgetterettereradvantage {
    private   int exp; //field
    public int getExp() {
        return exp*2;
    }

    public void setExp(int exp) { //setter method
        if(exp<0){ //validate exp
            System.out.println("incorrect exp");
       return;
        }
        this.exp=exp;
    }

    public static void main(String[] args) {
        ThisKeyEmployeeWIthgetterettereradvantage employee=new ThisKeyEmployeeWIthgetterettereradvantage();
        employee.setExp(5);
        System.out.println(employee.getExp());
    }


}
