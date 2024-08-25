public abstract class Animals {
    private static int counter = 0;

    public Animals() {
        counter++;
    }

    public abstract void running(int distance);

    public abstract void swimming(int distance);

    public static int getCounter() {
        return counter;
    }
}
