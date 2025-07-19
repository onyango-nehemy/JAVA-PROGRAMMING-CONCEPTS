import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
public class Regex {
    public static void main(String[] args){
    String input="123 abc 245 def 789";
    Scanner scanner=new Scanner(input);
    
    //regex 
    String regex="\\d+";
    
    Pattern pattern=Pattern.compile(regex);
    while(scanner.hasNext(pattern)){
        System.out.println("Found Number: "+scanner.next(pattern));
    }
    scanner.close();
    
      



    
    
          
        
    }
    
}
