public class Dog extends Animals {
    private static int counter = 0;
    private String nickname;
    private boolean isFull;

    public Dog(String nickname) {
        super();
        counter++;
        this.nickname = nickname;
    }

    public void running(int distance) {
        if (distance < 501) {
            System.out.println(nickname + "пробежал(а): " + distance + "м.");
        } else {
            System.out.println(nickname + "не смог(ла) преодолеть дистанцию!");
        }
    }

    public void swimming(int distance) {
        if (distance < 11) {
            System.out.println(nickname + "проплыл(а): " + distance + "м.");
        } else System.out.println(nickname + "не смог(ла) преодолеть дистанцию!");
    }

    public static int getCounter() {
        return counter;
    }
}

