import java.util.Scanner;
public class BinarySearch1 {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.println("Enter a number please: ");
        int number=input.nextInt();
        
        if(number<=100){
            System.out.println("Psst the number to be found is "+number);
            
            int low=1;
            int high=100;
            int attempts=0;
            
            while(low<=high){
                int middle=(low+high)/2;
                attempts++;
                System.out.println("Attempts: "+attempts+"Guessing: "+middle);
                if(middle==number){
                    System.out.println("Found!! it The number is :"+middle+"In attempts: "+attempts);
                    break;
                }else if(middle<number){
                    System.out.println("Guess is low");
                    low=middle+1;
                }else{
                    System.out.println("too high");
                    high=middle-1;
                }
            }
        }else{
            System.out.println("input a value between 1 and 100");
        }
        
    }
    
}
