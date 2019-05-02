package Lesson_2;

public class DayOfWeekMain {
    public static void main(String[] args) {
        System.out.println(getWorkingHours(DayOfWeek.MONDAY));
    }

    public static String getWorkingHours(DayOfWeek d) {
        String result = "";
        switch (d) {
            case MONDAY: result = "Осталось 40 часов"; break;
            case TUESDAY: result = "Осталось 32 часов"; break;
            case WEDNESDAY: result = "Осталось 24 часов"; break;
            case THURSDAY: result = "Осталось 16 часов"; break;
            case FRIDAY: result = "Осталось 8 часов"; break;
            case SATURDAY: result = "Рабочая неделя закончена"; break;
            case SUNDAY: result = "Рабочая неделя закончена"; break;
        }
        return result;
    }

    public enum DayOfWeek {
        MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
    }
}
