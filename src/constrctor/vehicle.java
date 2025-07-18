package constrctor;
//constructor chaining

public class vehicle {

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String brand;


    public vehicle(){
        this("honda");
    }

    public vehicle(String brand){
       this.brand=brand;

    }

    public static void main(String[] args) {
        vehicle vehicle=new vehicle();
        System.out.println(vehicle.getBrand());
    }
}
