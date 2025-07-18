package abstractt;

abstract class Univbersity {

    // concrete non-abstract method
    void courses(){
        System.out.println("P, c, m");
    }

    // abstract method, at least one required for an abstract class
    abstract void sports();
}

// Child class
class College extends Univbersity {
    // Implement the abstract method
    void sports(){
        System.out.println("found");
    }
}

public class Test {
    public static void main(String[] args) {
        Univbersity univbersity = new College(); // cannot instantiate abstract class directly
        univbersity.courses();
        univbersity.sports();
    }
}


/*abstract class Parent {
    // Concrete method
    void display() {
        System.out.println("Display from Parent");
    }

    // Abstract method
    abstract void show();
}

// Child class extends the abstract Parent class and implements the abstract method
class Child extends Parent {
    @Override
    void show() {
        System.out.println("Show from Child");
    }
}

public class TestAbstractClass {
    public static void main(String[] args) {
        Parent obj = new Child();
        obj.display();
        obj.show();
    }
}*/
