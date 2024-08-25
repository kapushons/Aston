public class Triangle implements Interfaces.Shape, Interfaces.Fillable, Interfaces.Borderable {
    private double side1;
    private double side2;
    private double side3;
    private String filling;
    private String borderColor;

    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public double calculatePerimeter() {
        return side1 + side2 + side3;
    }

    public double calculateArea() {
        double halfPerimeter = calculatePerimeter() / 2;
        return Math.sqrt(halfPerimeter * (halfPerimeter - side1) * (halfPerimeter - side2) * (halfPerimeter - side3));
    }

    public void setFilling(String color) {
        this.filling = color;
    }

    public void setBorderColor(String color) {
        this.borderColor = color;
    }

    public void printingCharacteristics() {
        System.out.println("Треугольник: ");
        System.out.println("Периметр: " + calculatePerimeter());
        System.out.println("Площадь: " + calculateArea());
        System.out.println("Заливка: " + filling);
        System.out.println("Цвет обводки: " + borderColor);
    }

    @Override
    public void borderColor(String color) {

    }

    @Override
    public void filling(String color) {

    }
}
