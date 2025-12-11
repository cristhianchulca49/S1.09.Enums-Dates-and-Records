package Level1.E2_E3;

public class Task {
    public static String checkBattery(Level level) {
        return switch (level) {
            case LOW -> "LOW BATTERY: cannot star the car";
            case MEDIUM -> "MEDIUM BATTERY: can only star only eco mode";
            case HIGH -> "HIGH BATTERY: can start in power mode";
        };
    }
}