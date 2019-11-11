public class ShapeFactory {
    private static ShapeFactory instance;

    private ShapeFactory() {
    }

    public Shapeable createRandomShape() {
        int axis = getRandomNumber();
        try {
            if (axis == 1) {
                return new Circle(new Point());
            } else if (axis == 3) {
                return new Triangle(new Point(), new Point(), new Point());
            } else if (axis == 4) {
                return new Square(new Point(1,1), new Point(2,1),new Point(2,2),new Point(2,1));
            }
            System.out.println("Figure with axis " + axis + " cannot be created");
            return null;

        } catch (NullPointerException e) {
            return null;
        }
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
