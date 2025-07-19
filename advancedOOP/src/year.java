import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
public class year {
    //method to get a day
    public static String findDay(String dateString){
        //define dateformat
        DateTimeFormatter formatter=DateTimeFormatter.ofPattern("MM/dd/yyyy");
        LocalDate date=LocalDate.parse(dateString,formatter);
        
        //get day of the week
        java.time.DayOfWeek dayOfWeek=date.getDayOfWeek();
        
        return dayOfWeek.toString();
    }
    public static void main(String[] args){
        String date="07/12/2000";
        String day=findDay(date);
        System.out.println("The day : "+day);
    }
    
}
