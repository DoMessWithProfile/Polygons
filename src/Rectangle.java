public class Rectangle extends Quadrilateral {

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double area() {
        return width * height;
    }

    /* This is now done within the Quadrilateral class
    @Override
    public int numberOfSides() {
        return 4;
    }
    */
}
