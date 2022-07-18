import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class Dates {
    public static void main(String[] args) {
        
        System.out.println("Current Date: " +LocalDate.now());
        System.out.println("Current Time: " +LocalTime.now());
        System.out.println("Current Date&Time: " +LocalDateTime.now());

        LocalDate dateA = LocalDate.of(2020, Month.MARCH, 15);
        LocalDate dateB = LocalDate.of(2020, 3, 15);
        System.out.println("dateA: " +dateA+ " DateB: "+dateB);

        LocalTime time = LocalTime.of(9,33);
        System.out.println("time: " + time);

        LocalDate mDate = LocalDate.of(2021, Month.JULY, 04);
        System.out.println(mDate);
        mDate = mDate.plusDays(12);
        System.out.println(mDate);
        mDate = mDate.withYear(2019);
        System.out.println(mDate);


    }
}
