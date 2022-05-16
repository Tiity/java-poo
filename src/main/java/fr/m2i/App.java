package fr.m2i;

public final class App {
    private App() {
    }

    /**
     * @param args The arguments of the program.
     */
    public static void main(String[] args) {
        Car car = new Car();
        car.showStats();

        System.out.println("----- Car story -----");

        while (car.getCurrentGas() > 0) {
            try {
                car.drive();
            } catch (Exception e) {
                System.out.println(e.getMessage());
                System.out.println("----- End of Story -----");
                car.showStats();
                break;
            }
        }

        System.out.println();

        Bus bus = new Bus();
        bus.showStats();
        System.out.println("----- Bus story -----");

        while (bus.getCurrentGas() > 0) {
            try {
                bus.drive();
            } catch (Exception e) {
                System.out.println(e.getMessage());
                System.out.println("----- End of Story -----");
                bus.showStats();
                break;
            }
        }
    }
}
