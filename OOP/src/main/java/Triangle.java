
public class Triangle extends Figure implements Shapeable {
    private final Point a;
    private final Point b;
    private final Point c;
    private final String type = "Triangle";
    private final String color = "Red";


    public Triangle(Point a, Point b, Point c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }


    private double square = -1;

    public double getSquare() {
        if (square == -1) {
            double ab = a.distanceTo(b);
            double bc = b.distanceTo(c);
            double ac = a.distanceTo(c);
            double p = (ab + bc + ac) / 2;
            square = Math.sqrt(p * (p - ab) * (p - bc) * (p - ac));
        }
        return square;
    }

    public double getPerimeter() {
        double ab = a.distanceTo(b);
        double bc = b.distanceTo(c);
        double ac = a.distanceTo(c);
        return ab + bc + ac;
    }

    public String getType() {
        return type;
    }

    public String getColor() {
        return color;
    }


}
