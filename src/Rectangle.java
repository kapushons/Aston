public class Rectangle implements Interfaces.Shape, Interfaces.Fillable, Interfaces.Borderable {
    private double width;
    private double height;
    private String filling;
    private String borderColor;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double calculatePerimeter() {
        return 2 * (width + height);
    }

    public double calculateArea() {
        return width * height;
    }

    public void setFilling(String color) {
        this.filling = color;
    }
    public void setBorderColor(String color) {
        this.borderColor = color;
    }

    public void printingCharacteristics() {
        System.out.println("Прямоугольник: ");
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
