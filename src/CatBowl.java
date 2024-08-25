public class CatBowl {
    private int food;

    public CatBowl(int food) {
        this.food = food;
    }

    public boolean eatUp(int amount) {
        if (amount < 1) {
            System.out.println("Еды должно быть больше!");
            return false;
        }
        if (food >= amount) {
            food -= amount;
            return true;
        }
        System.out.println("Вмиске недостаточное еды! Осталось: " + food + " штук.");
        return false;
    }

    public void addFood(int amount) {
        if (amount > 0) {
            food += amount;
            System.out.println("Добавлена еды: " + amount + " штук.");
        } else {
            System.out.println("Количество еды должно быть больше нуля.");
        }
    }

    public int getFood() {
        return food;
    }
}
