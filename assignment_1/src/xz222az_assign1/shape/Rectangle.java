package xz222az_assign1.shape;

public class Rectangle extends Shape {
    private double base;
    private double height;


    public Rectangle(String name,double base, double height){
        super(name);
        this.base = base;
        this.height = height;
    }

    @Override
    public double getArea() {
        return base * height;
    }

    @Override
    public double getPerimeter() {
        return 2 * (base + height);
    }

}
