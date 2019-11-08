public class Main {
    public static void main(String[] args) {
        ShapeFactory factory = ShapeFactory.getInstance();

        for (int i = 1; i <= 5; i++) {
            System.out.println(factory.createShape(factory.getRandomNumber()));
        }
    }
}
