import java.math.*;

public class PolygonPlus implements Polygon {
    private double sideLength;
    private int numberOfSides;

    public PolygonPlus(int numberOfSides, double sideLength) {
        this.sideLength = sideLength;
        this.numberOfSides = numberOfSides;
    }

    @Override
    public double area() {
        switch (numberOfSides) {
            case 5: // Pentagon
                return (sideLength * sideLength) * (Math.sqrt(5 * (5 + 2 * Math.sqrt(5))));
            case 6: // Hexagon
                return (3 * Math.sqrt(3) / 2) * (sideLength * sideLength);
            case 7: // Heptagon
                return (7 / 4) * (Math.sqrt(5 + 2 * Math.sqrt(5))) * (sideLength * sideLength);
            case 8: // Octagon
                return (2 + Math.sqrt(2)) * (sideLength * sideLength);
            case 9: // Nonagon
                return (9 / 4) * (Math.sqrt(5 + 2 * Math.sqrt(5))) * (sideLength * sideLength);
            case 10: // Decagon
                return (5 + Math.sqrt(5)) * (sideLength * sideLength);
            case 11: // Hendecagon
                return (11 / 4) * (Math.sqrt(5 + 2 * Math.sqrt(5))) * (sideLength * sideLength);
            default:
                return 0;
        }
    }

    @Override
    public int numberOfSides() {
        return numberOfSides;
    }
}

