public abstract class Figure implements Shapeable {

    public String toString() {
        return getType() + " color: " + getColor() + " square: " + getSquare() + " perimeter: " + getPerimeter();
    }

}
