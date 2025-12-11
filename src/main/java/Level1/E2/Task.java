package Level1.E2;

public class Task {
    public static String checkBattery(Level level) {
        return level.battery() ? level + " BATTERY: cannot star the car" : level + " BATTERY: starting car";
    }
}