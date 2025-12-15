package Level1.E2;

public class Task {
    public static String checkBattery(Level level) {
        return switch (level) {
            case LOW -> "LOW BATTERY: cannot start the car";
            case MEDIUM -> "MEDIUM BATTERY: can only start in eco mode";
            case HIGH -> "HIGH BATTERY: can start in power mode";
        };
    }
}