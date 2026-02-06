import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FiguresTest {
    @Test
    public void testSquareArea() {
        // Lado = 2.3 -> Area = 5.29
        Figure fig = new Square(2.3);
        assertEquals(5.29, fig.calculateArea(), 0.001);
    }

    @Test
    public void testTriangleArea() {
        // Base = 4.2, Altura = 4.5 -> Area = (4.2 * 4.5) / 2 = 9.45
        Figure fig = new Triangle(4.2, 4.5);
        assertEquals(9.45, fig.calculateArea(), 0.001);
    }

    @Test
    public void testCircleArea() {
        // Radio = 1.0 -> Area = PI * 1^2
        Figure fig = new Circle(1.0F);
        double expected = Math.PI;
        assertEquals(expected, fig.calculateArea(), 0.001);
    }

    @Test
    public void testCirclePerimeter() {
        // Radio = 1.0 -> Perimetro = 2 * PI * 1
        Figure fig = new Circle(1.0F);
        double expected = 2 * Math.PI;
        assertEquals(expected, fig.calculatePerimeter(), 0.001);
    }
}
