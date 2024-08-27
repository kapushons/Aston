public class Park {
    private String name;

    public Park(String name) {
        this.name = name;
    }

    public class Attraction {
        private String name;
        private String timeWorke;
        private String prace;

        public Attraction(String name, String timeWorke, String prace) {
            this.name = name;
            this.timeWorke = timeWorke;
            this.prace = prace;
        }

        public void informationAttraction() {
            System.out.println("Название аттракциона: " + name + "\n" +
                    "Часы работы: " + timeWorke + "\n" +
                    "Стоимость посещения: " + prace);
        }
    }

    public static void getInfoPark() {
        Park park = new Park("Астон");

        Attraction attractionTrampoline = park.new Attraction("Батут", "09:00 - 13:00", "700");
        Attraction attractionShooting = park.new Attraction("Тир", "13:00 - 17:00", "1 700");
        Attraction attractionShip = park.new Attraction("Лодочка", "17:00 - 19:00", "300");

        attractionTrampoline.informationAttraction();
        attractionShooting.informationAttraction();
        attractionShip.informationAttraction();
    }
}
