import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class FormatDate {
    public static String formatToFullText(LocalDateTime dateTime) {
        if(dateTime == null){
            return null;
        }
        DateTimeFormatter format = DateTimeFormatter.ofPattern("'Le 'dd MMM 'de l''an 'yyyy 'à 'HH'h'mm'm et' ss's'", Locale.FRANCE);
        return dateTime.format(format);
    }

    public static String formatSimple(LocalDate date) {
        if(date == null){
            return null;
        }
        DateTimeFormatter format = DateTimeFormatter.ofPattern("LLLL dd yy", Locale.ITALIAN);
        return date.format(format);
    }

    public static String formatIso(LocalTime time) {
        if(time == null){
            return null;
        }
        DateTimeFormatter format = DateTimeFormatter.ISO_LOCAL_TIME;;
        return time.format(format);
    }
}
