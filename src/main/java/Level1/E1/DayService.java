package Level1.E1;

public class DayService {

    public static String checkDay(Day today) {
        return switch (today) {
            case SATURDAY, SUNDAY -> today + ": is Weekend";
            default -> today + ": is working day";
        };
    }
}