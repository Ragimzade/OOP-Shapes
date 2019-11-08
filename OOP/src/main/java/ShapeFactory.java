

public class ShapeFactory {
    private static ShapeFactory instance;
    private int axis;

    private ShapeFactory() {
    }

    public Shapeable createShape(int axis) {


        try {
            if (axis == 1) {
                return new Сircle();
            } else if (axis == 3) {
                return new Triangle();
            } else if (axis == 4) {
                return new Square();
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

    public int getRandomNumber() {
        return (int) (Math.random() * 6);
    }
}
