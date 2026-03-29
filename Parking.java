public class Parking {

    static int total = 5;
    static int used = 0;

    // method to park car
    static void parkCar() {
        if (used < total) {
            used++;
            System.out.println("Car Parked");
        } else {
            System.out.println("Parking Full");
        }
    }

    // method to remove car
    static void removeCar() {
        if (used > 0) {
            used--;
            System.out.println("Car Removed");
        } else {
            System.out.println("Parking Empty");
        }
    }

    // method to show status
    static void showStatus() {
        System.out.println("Total: " + total);
        System.out.println("Used: " + used);
        System.out.println("Free: " + (total - used));
    }

    public static void main(String[] args) {

        parkCar();
        parkCar();
        removeCar();
        showStatus();
    }
}