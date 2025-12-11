package Level1.E1;

public class DayService {

    public static void checkDay(Day today) {
        switch (today) {
            case SATURDAY, SUNDAY -> System.out.println(today + ": is Weekend");
            default -> System.out.println(today + ": is working day");
        }
    }
}