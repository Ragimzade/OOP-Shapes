public class Circle extends Figure implements Shapeable {
    private final Point a;
    private final String type = "Circle";
    private final String color = "Black";


    public Circle(Point a) {
        this.a = a;
    }

    private double getRadius() {
        return a.distanceTo(new Point(0, 0));
    }

    public double getSquare() {
        return 3.14 * Math.pow(getRadius(), 2);
    }

    public double getPerimeter() {
        return 2 * 3.14 + getRadius();
    }

    public String getType() {
        return type;
    }

    public String getColor() {
        return color;
    }

}
