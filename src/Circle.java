import java.awt.*;

public class Circle extends Figure {
    private float radius;

    public Circle(double x1, double y1,  float r) {
        super(x1, y1);
        this.radius = r;
    }

    @Override
    public double calculateArea() {
        return Math.PI * Math.pow(this.radius, 2);
    }

    @Override
    public double calculatePerimeter() {
        return Math.PI * radius * 2;
    }
}
