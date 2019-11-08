public abstract class Figure implements Shapeable {
    public String toString() {
        return getType() + " " + getColor() + " " + getSquare() + " " + getPerimeter();
    }
}
