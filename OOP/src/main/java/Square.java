public class Square extends Figure implements Shapeable {
    private final Point a;
    private final Point b;
    private final Point c;
    private final Point d;
    private final String type = "Square";
    private final String color = "Black";


    public Square(Point a, Point b, Point c, Point d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }

    public String getType() {
        return type;
    }

    public String getColor() {
        return color;
    }

    private double square = -1;

    public double getSquare() {
        if (square == -1) {
            double ab = a.distanceTo(b);
            double bc = b.distanceTo(c);
            double cd = c.distanceTo(d);
            double da = d.distanceTo(a);
            if (ab == bc && bc == cd && da==ab) {
                square = Math.pow(ab, 2);
            } else {
                System.out.println("Square doesn't exist");
                throw new NullPointerException();
            }
        }
        return square;
    }

    public double getPerimeter() {
        return Math.sqrt(getSquare()) * 4;
    }

}

