public class Ticket {
    private final double distance;
    private final int age;
    private final double baseRatePerKm = 0.30;

    public Ticket(double distance, int age) {
        if (distance <= 0 || age <= 0) {
            throw new IllegalArgumentException("Distance and age must be positive numbers and not equal to zero.");
        }
        this.distance = distance;
        this.age = age;
    }

    public double calculatePrice() {
        double price = distance * baseRatePerKm;
        if (age < 12) {
            price *= 0.5; // 50% discount for children
        } else if (age >= 65) {
            price *= 0.7; // 30% discount for seniors
        }
        return price;
    }
}
