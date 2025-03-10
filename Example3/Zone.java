import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class Zone {
    //function to get zone date and time
    public static void ZonedTimeAndDate() {
        LocalDateTime date = LocalDateTime.now();
        DateTimeFormatter format1 = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String formattedCurrentDate = date.format(format1);
        System.out.println("formatted current date and time: " + formattedCurrentDate);

        //to get current zone
        ZonedDateTime currentZone = ZonedDateTime.now();
        System.out.println("the current zone is: " + currentZone.getZone());

        //getting time zone of specific place
        //we use withZoneSameInstant(): It is used to return a copy of this date-time with a different time-zone, retaining the instant
        ZoneId tokyo = ZoneId.of("Asia/Tokyo");
        ZonedDateTime tokyoZone = currentZone.withZoneSameInstant(tokyo);
        System.out.println("tokyo time zone is " + tokyoZone);
        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String formattedDateTime = tokyoZone.format(format);
        System.out.println("formatted tokyo time zone " + formattedDateTime);
    }
    public static void main(String[] args) {
        ZonedTimeAndDate();
    }
}
