import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Exercise3 {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd, EEEE");
        String formattedToday = today.format(formatter);
        System.out.println("Today's date and day of the week is: " + formattedToday);
    }
}
