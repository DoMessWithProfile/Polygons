public abstract class Quadrilateral implements Polygon {
    protected double width, height;

    // Quadriaterals have different ways of calculating area
    public abstract double area();
    
    // All quadrilaterals have 4 sides
    public int numberOfSides() {
        return 4;
    }
}
