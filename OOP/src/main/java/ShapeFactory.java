public class ShapeFactory {
    private static ShapeFactory instance;

    private ShapeFactory() {
    }

    public Shapeable createRandomShape() {
        int numberOfPoints = getRandomNumber();
            if (numberOfPoints == 1) {
                return new Circle(new Point());
            } else if (numberOfPoints == 3) {
                return new Triangle(new Point(1,2), new Point(1,3),new Point(1,4));
            } else if (numberOfPoints == 4) {
                return new Square(new Point(1,1), new Point(2,1),
                        new Point(2,2),new Point(2,1));
            }
            System.out.println("Figure with axis " + numberOfPoints + " cannot be created");
            return null;

    }

    public static ShapeFactory getInstance() {
        if (instance == null) {
            instance = new ShapeFactory();
        }
        return instance;
    }

    private int getRandomNumber() {
        return (int) (Math.random() * 6);
    }
}
