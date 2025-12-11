package Level1.E3;

public enum LevelBattery {
    LOW,
    MEDIUM,
    HIGH;

    public static LevelBattery getLevel(int percent) {
        if (percent <= 33) {
            return LOW;
        } else if (percent <= 66) {
            return MEDIUM;
        } else {
            return HIGH;
        }
    }
}
