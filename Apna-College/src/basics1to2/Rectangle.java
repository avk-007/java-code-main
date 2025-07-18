package basics1to2;

public class Rectangle {
    int a = 3;
    int b = 2;

   /* // Constructor (optional here, as you have default values)
    public Rectangle() {
    }
*/
    // Method to calculate area
    public int getArea() {
        return a * b;
    }

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        System.out.println(rectangle.getArea());
    }
}
