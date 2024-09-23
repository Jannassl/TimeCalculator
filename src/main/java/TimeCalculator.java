public class TimeCalculator {
    public double calculateTime(double distance, double speed) {
        if (speed <= 0) {
            throw new IllegalArgumentException("Speed must be greater than zero.");
        }
        return distance / speed;
    }

    public static void main(String[] args) {
        TimeCalculator calculator = new TimeCalculator();
        double distance = 100.0; // example distance
        double speed = 50.0; // example speed
        double time = calculator.calculateTime(distance, speed);
        System.out.println("Time: " + time);
    }
}