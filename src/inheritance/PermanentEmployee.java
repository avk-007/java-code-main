package inheritance;

public class PermanentEmployee extends Employee {

    public void doFun(){
        System.out.println("salary for emlpyee permanent");
    }

    public static void main(String[] args) {
//        /create emp object/

        PermanentEmployee permanentEmployee=new PermanentEmployee();
        //call sub class own method
        //super class method autiomatically avaiable
        //for subclass object

        permanentEmployee.setExp(5);
        double salary=permanentEmployee.calcsalary();
        System.out.println(salary);
    }


}
