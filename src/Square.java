import java.awt.*;

public class Square extends Figure {
    private double side;

    public Square(double side) {
        super(0, 0);
        this.side = side;
    }

    @Override
    public double calculateArea() {
        return side * side;
    }

    @Override
    public double calculatePerimeter() {
        return 4 * side;
    }
}
