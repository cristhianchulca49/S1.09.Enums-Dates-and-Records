package Level1.E2;

public class Task {
    public static String checkBattery(Level level) {
        return switch (level) {
            case LOW -> "LOW BATTERY: cannot star the car";
            case MEDIUM -> "MEDIUM BATTERY: starting eco mode";
            case HIGH -> "HIGH BATTERY: starting car";
        };
    }
}