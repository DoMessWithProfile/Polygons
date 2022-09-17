public class Square extends Quadrilateral {
    private double size;

    public Square(double size) {
        this.size = size;
    }

    @Override
    public double area() {
        return size * size;
    }

    /* This is now done within the Quadrilateral class
    @Override
    public int numberOfSides() {
        return 4;
    }
    */
}
