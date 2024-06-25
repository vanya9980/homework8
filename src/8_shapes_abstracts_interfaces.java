// Абстрактний клас для базової фігури
abstract class Shape {
    // Абстрактний метод для отримання назви фігури
    public abstract String getName();
}

// Клас для круга
class Circle extends Shape {
    @Override
    public String getName() {
        return "Circle";
    }
}

// Клас для прямокутника
class Rectangle extends Shape {
    @Override
    public String getName() {
        return "Rectangle";
    }
}

// Клас для квадрата
class Square extends Shape {
    @Override
    public String getName() {
        return "Square";
    }
}

// Клас для трикутника
class Triangle extends Shape {
    @Override
    public String getName() {
        return "Triangle";
    }
}

// Клас для еліпса
class Ellipse extends Shape {
    @Override
    public String getName() {
        return "Ellipse";
    }
}

// Клас для виведення назви фігури
class ShapePrinter {
    public void printShapeName(Shape shape) {
        System.out.println("Shape: " + shape.getName());
    }
}

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