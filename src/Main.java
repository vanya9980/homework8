// Клас для тестування
class Main {
    public static void main(String[] args) {
        Shape circle = new Circle();
        Shape rectangle = new Rectangle();
        Shape square = new Square();
        Shape triangle = new Triangle();
        Shape ellipse = new Ellipse();

        ShapePrinter printer = new ShapePrinter();
        printer.printShapeName(circle);
        printer.printShapeName(rectangle);
        printer.printShapeName(square);
        printer.printShapeName(triangle);
        printer.printShapeName(ellipse);
    }
}
