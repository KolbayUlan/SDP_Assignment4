package ShapeAreaCalculator;



public class Main {
    public static void main(String[] args) {
        Drawing drawing = new Drawing();

        drawing.addShape(new Circle(3));
        drawing.addShape(new Rectangle(5, 10));
        drawing.addShape(new Triangle(5, 2));

        AreaCalculator areaCalculator = new AreaCalculator();

        drawing.calculateAreas(areaCalculator);
    }
}

