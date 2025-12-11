package Level1.E3;

public class CarServices {
    public static String checkBattery(int percent) {
        return LevelBattery.getLevel(percent).getMessage();
    }

    public static boolean startCar(int percent) {
        return LevelBattery.getLevel(percent) != LevelBattery.LOW;
    }
}
