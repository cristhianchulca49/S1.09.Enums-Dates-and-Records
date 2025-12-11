package Level1.E3;

public class CarServices {
    public static String checkBattery(int percent) {
        return switch (LevelBattery.getLevel(percent)) {
            case LOW -> "LOW BATTERY: cannot star the car";
            case MEDIUM -> "MEDIUM BATTERY: can only star in eco mode";
            case HIGH -> "HIGH BATTERY: can start in power mode";
        };
    }
}
