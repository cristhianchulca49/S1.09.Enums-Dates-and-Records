package Level1.E1;

public class Main {
    public static void main(String[] args) {
        for (Day today : Day.values()) {
            DayService.checkDay(today);
        }
    }
}
