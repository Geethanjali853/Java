import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import java.time.Duration;
import java.time.Period;

public class PnD {
    public static void checkingPeriod() {
        LocalDate date1 = LocalDate.now();
        LocalDate date2 = LocalDate.of(2014, Month.DECEMBER, 12);
        Period gap = Period.between(date2, date1);
        System.out.println("gap between dates is a period of " + gap);
    }

    //function to check duration
    public static void checkingDuration() {
        LocalTime time1 = LocalTime.now();
        System.out.println("the current tiem is " + time1);
        Duration fiveHours = Duration.ofHours(5);

        //adding five hours to the current time and storing it in time2
        LocalTime time2 = time1.plus(fiveHours);
        System.out.println("After adding five hours of duration " + time2);
        Duration gap = Duration.between(time2, time1);
        System.out.println("Duration gap between time1 and time2 is " + gap);
    }

    public static void main(String[] args) {
        checkingPeriod();
        checkingDuration();
    }
}
