public class MainShape {
    public static void main(String[] args) {
        Circle circle = new Circle(54);
        circle.setFilling("Красный");
        circle.setBorderColor("Желтый");
        circle.printingCharacteristics();

        Rectangle rectangle = new Rectangle(43, 66);
        rectangle.setFilling("Голубой");
        rectangle.setBorderColor("Зеленый");
        rectangle.printingCharacteristics();

        Triangle triangle = new Triangle(21, 17, 11);
        triangle.setFilling("Фиолетовый");
        triangle.setBorderColor("Розовый");
        triangle.printingCharacteristics();
    }
}
