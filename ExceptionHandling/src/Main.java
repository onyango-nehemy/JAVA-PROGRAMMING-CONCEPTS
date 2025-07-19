import java.util.Scanner;

//in this program we are dividing two numbers(based on user input.if user enters 0 as denominator
//the program will raise an exception

public class Main {
    public static void main(String[] args){
        int numerator, denominator;
        double result;
        
        //take inputs from users
        System.out.println("Enter numerator and denominator:");
        Scanner input=new Scanner(System.in);
        
        numerator=input.nextInt();
        denominator=input.nextInt();
        
        //code that may generator error
        
        try{
            result=numerator/denominator;
            System.out.println("result: "+result);
        }catch(Exception e){
            System.out.println("denominator cannot  be 0.");
            System.out.println("Exception: "+e);
        
        }
            
        
   
    }
}
//try ...catch block is used to catch and handle exceptions.
/*
try{
//code that might cause an exception
}
catch(exception e){
code that runs if exception occurs
}
*/