import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.LocalDate;

public class Date {
    public static void main(String[] args){
        LocalDate myDate=LocalDate.now();
    System.out.println("Current Time: "+myDate);
    DateTimeFormatter dateFormat=DateTimeFormatter.ofPattern("E");
    
    String formattedDate=myDate.format(dateFormat);
    
    System.out.println("Date:"+formattedDate);
    }
    
}
