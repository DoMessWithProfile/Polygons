public class Triangle implements Polygon {
    private double base, height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public double area() {
        return base * height / 2;
    }

    @Override
    public int numberOfSides() {
        return 3;
    }
}  
