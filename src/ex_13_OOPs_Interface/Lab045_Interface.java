package ex_13_OOPs_Interface;

public class Lab045_Interface {
    public static void main(String[] args) {
        Rectangle rect = new Rectangle();
        rect.getArea(10,20);

        Triangle tri = new Triangle();
        tri.getArea(10,20);
    }
}

interface Polygon{
    void getArea(int length, int breadth);
}

class Rectangle implements Polygon{

    @Override
    public void getArea(int length, int breadth) {
        System.out.println("Area of Rectangle: "+(length*breadth));
    }
}
class Triangle implements Polygon{

    @Override
    public void getArea(int length, int height) {
        System.out.println("Area of triangle: "+(0.5*length*height));
    }
}