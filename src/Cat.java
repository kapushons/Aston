public class Cat extends Animals {
    private static int counter = 0;
    private String nickname;
    private boolean isFull;

    public Cat(String nickname) {
        super();
        counter++;
        this.nickname = nickname;
        this.isFull = false;
    }

    public void running(int distance) {
        if (distance < 201) {
            System.out.println(nickname + "пробежал(а): " + distance + "м.");
        } else System.out.println(nickname + "не смог(ла) преодолеть дистанцию!");
    }

    public void swimming(int distance) {
        System.out.println(nickname + "не умеет плавать!!!");
    }

    public void eating(CatBowl bowl, int amount) {
        if (bowl.eatUp(amount)) {
            this.isFull = true;
            System.out.println(nickname + " поел(а).");
        } else System.out.println(nickname + " хочет кошац, но хозяин не положил еду!!!");
    }

    public boolean isFull() {
        return isFull;
    }

    public static int getCounter() {
        return counter;
    }

    public String toString() {
        return nickname;
    }
}
