package Level1.E3;

public enum LevelBattery {
    LOW("LOW BATTERY: cannot start the car"),
    MEDIUM("MEDIUM BATTERY: can only start in eco mode"),
    HIGH("HIGH BATTERY: can start in power mode");

    private final String message;

    LevelBattery(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public static LevelBattery getLevel(int percent) {
        if (percent <= 33) return LOW;
        if (percent <= 66) return MEDIUM;
        return HIGH;
    }
}
