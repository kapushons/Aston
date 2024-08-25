public class Circle implements Interfaces.Shape, Interfaces.Fillable, Interfaces.Borderable {
    private double radius;
    private String filling;
    private String borderColor;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }

    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    public void setFilling(String color) {
        this.filling = color;
    }

    public void setBorderColor(String color) {
        this.borderColor = color;
    }
    public void printingCharacteristics() {
        System.out.println("Круг: ");
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
