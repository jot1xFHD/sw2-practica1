//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    Figure fig1 = new Circle(1.0F); //radio
    Figure fig2 = new Square(2.3); //lado
    Figure fig3 = new Triangle(4.2, 4.5); //base y altura
    List<Figure> figures = new ArrayList<>();
    figures.add(fig1);
    figures.add(fig2);
    figures.add(fig3);
    for (Figure fig : figures) {
        System.out.println("Area: " + fig.calculateArea());
        System.out.println("Perimeter: " + fig.calculatePerimeter());
    }
}
