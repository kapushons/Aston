public class MainAnimals {
    public static void main(String[] args) {
        Dog dog0 = new Dog("Луна - ");
        Dog dog1 = new Dog("Герда - ");
        Cat cat2 = new Cat("Соня - ");
        Cat cat3 = new Cat("Ханна - ");

        dog0.running(400);
        dog1.running(500);
        cat2.running(70);
        cat3.running(170);
        dog0.swimming(4);
        dog1.swimming(50);
        cat2.swimming(5);
        cat3.swimming(1);

        System.out.println("Приняло участие " + Animals.getCounter() + " животных.");
        System.out.println("Из них " + Dog.getCounter() + " собак,");
        System.out.println("и " + Cat.getCounter() + " кошек.");

        CatBowl bowl = new CatBowl(50);
        Cat[] cats = {cat2, cat3};

        for (Cat cat : cats) {
            cat.eating(bowl, 25);
            System.out.println(cat + " сыт(а): " + cat.isFull());
        }
        System.out.println("Остаток еды в миске: " + bowl.getFood() + " штук.");

        if (!cats[0].isFull()) {
            cats[0].eating(bowl, 51);
            System.out.println(cats[0] + " сыт(а): " + cats[0].isFull());
        }
        if (!cats[1].isFull()) {
            cats[1].eating(bowl, 70);
            System.out.println(cats[1] + " сыт(а): " + cats[1].isFull());
        }
        System.out.println("Остаток еды в миске: " + bowl.getFood() + " штук.");
    }
}
