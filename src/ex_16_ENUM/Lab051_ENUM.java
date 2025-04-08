package ex_16_ENUM;

public class Lab051_ENUM {
    public static void main(String[] args) {
        System.out.println(Days.MONDAY);
        System.out.println(Days.FRIDAY);
        System.out.println(PROJECT_URLs.google);
        System.out.println(PROJECT_URLs.vwo);
    }
}
enum Days{
    SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
}

enum PROJECT_URLs{
    google, restassured, katalon, vwo
}