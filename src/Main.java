public class Main {
    public static void main(String[] args) {
        System.out.println("Calculating area of polygons...");
        System.out.println("Options are Triangle, Square, Rectangle, and Polygon (where polygons are shapes with sides greater than 4 (Pentagon[5] -> Hendecagon[11])");
        System.out.println("You can also exit this system by typing 'exit'");
        System.out.print("Name of Polygons entered are not case sensitive. ");
        while (calculatePolygonArea()) {}
    }

    public static boolean calculatePolygonArea() {
        String nameOfPolygon = Input.getString("Choose a polygon to calculate the area of: ").toLowerCase();

        switch (nameOfPolygon) {
            case "rectangle":
                double width = Input.getDouble("Enter the width of the rectangle: ");
                double height = Input.getDouble("Enter the height of the rectangle: ");
                Rectangle rectangle = new Rectangle(width, height);
                System.out.println("The area of the rectangle is " + rectangle.area());
                break;
            case "triangle":
                double base = Input.getDouble("Enter the base of the triangle: ");
                double height2 = Input.getDouble("Enter the height of the triangle: ");
                Triangle triangle = new Triangle(base, height2);
                System.out.println("The area of the triangle is " + triangle.area());
                break;
            case "square":
                double sideLength = Input.getDouble("Enter the side length of the square: ");
                Square square = new Square(sideLength);
                System.out.println("The area of the square is " + square.area());
                break;
            case "polygon":
                System.out.print("The maximum number of sides is 11. ");
                int numberOfSides = Input.getInt("Enter the number of sides of the polygon: ");
                double sideLength2 = Input.getDouble("Enter the side length of the polygon: ");
                PolygonPlus polygon = new PolygonPlus(numberOfSides, sideLength2);
                System.out.println("The area of the polygon is " + polygon.area());
                break;
            case "exit":
                System.out.println("Exiting...");
                return false;
            default:
                System.out.println("Invalid polygon name.");
                break;
        }

        return true;
    }
}
