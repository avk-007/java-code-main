package constrctor;
//constructor overloading
public class Rectanagle {

    private int height;
    private int widhth;


    public Rectanagle(int height,int widhth){
        this.height=height;
        this.widhth=widhth;

    }

    public Rectanagle(int side){
        this.widhth=side;
        this.height=side;
    }

    public static void main(String[] args) {
        Rectanagle rectanagle=new Rectanagle(10,20);
        System.out.println(rectanagle.height* rectanagle.widhth);
        Rectanagle squre=new Rectanagle(5);
        System.out.println(squre.widhth*squre.height);

    }
}
