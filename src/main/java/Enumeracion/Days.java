package Enumeracion;

public class Days {
    public static void main(String[] args) {
        enum Day{
            Monday,
            Tuesday,
            wednesday,
            Thuesday,
            Friday,
            Saturdday,
            Sunday
        }

        Day day = Day.Friday;
        System.out.println(day);
    }
}
