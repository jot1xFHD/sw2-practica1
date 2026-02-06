import java.awt.*;

public class Circle extends Figure {
    private float radius;

    public Circle(float radius) {
        super(0, 0);
        this.radius = (float) radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * Math.pow(this.radius, 2);
    }

    @Override
    public double calculatePerimeter() {
        return Math.PI * this.radius * 2;
    }
}
