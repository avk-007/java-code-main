package inheritenceAll;

/*we can use interface
* java supports multiple imnheritance of interfaces
* */
public class solutionforMultipleinheritanceParent {

    public void Parentmethod() {
        System.out.println("parent method");
    }
}
        interface Interface1{
        void method1();
    }
    interface Interface2{
        void method2();
    }

   // child subclass
class child77 extends solutionforMultipleinheritanceParent implements Interface1,Interface2{

       @Override
       public void method1() {
           System.out.println("method1");
       }
       @Override
       public void method2() {
           System.out.println("method2");

       }
   }

