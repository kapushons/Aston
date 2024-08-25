public class Interfaces {
    public interface Shape {
        double calculatePerimeter();
        double calculateArea();
    }
    public interface Fillable {
        void filling(String color);
    }
    public interface Borderable {
        void borderColor(String color);
    }
}
