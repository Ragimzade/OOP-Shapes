import org.testng.Assert;
import org.testng.annotations.Test;

public class FigureTest {

    @Test
    public void triangleTest() {
        Triangle triangle = new Triangle(new Point(1, 2), new Point(3, 1), new Point(3, 2));
        Assert.assertEquals(triangle.toString(), "Triangle color: Red square: 1.0 perimeter: 5.23606797749979");

    }

    @Test
    public void triangleNegativeTest() {
        try {
            Triangle triangle = new Triangle(new Point(1, 2), new Point(1, 3),
                    new Point(1, 4));
        } catch (NullPointerException ex) {
            Assert.assertNotEquals("", ex.getMessage());
        }
    }

    @Test
    public void squareTest() {
        Square square = new Square(new Point(1, 1), new Point(2, 1),
                new Point(2, 2), new Point(2, 1));
        Assert.assertEquals(square.toString(), "Square color: Black square: 1.0 perimeter: 4.0");
    }

    @Test
    public void squareNegativeTest() {
        try {
            Square square = new Square(new Point(1, 1), new Point(2, 8),
                    new Point(2, 2), new Point(2, 1));
        } catch (NullPointerException ex) {
            Assert.assertNotEquals("", ex.getMessage());
        }
    }

    @Test
    public void circleTest() {
        Circle circle = new Circle(new Point(4, 8));
        Assert.assertEquals(circle.toString(),
                "Circle color: Black square: 251.20000000000005 perimeter: 15.22427190999916");
    }

    @Test
    public void shapeFactoryTest() {
        ShapeFactory factory= ShapeFactory.getInstance();
        Assert.assertNotEquals("",factory.createRandomShape());
    }
}
