import java.util.Random;
 
public class BinarySearch {
    public static void main(String[]args){
        Random random=new Random();
        int secretNumber=random.nextInt(100)+1;
        System.out.println("Psst! the secret number is "+secretNumber +"(just for you to know)");
        //Binary Search to guess the number
        int low=1;
        int high=100;
        int attempts=0;
        while(low<=high){
            int guess=(low+high)/2;
            attempts++;
            System.out.println("Attempt "+attempts+": Guessing "+guess+"...");
            if(guess==secretNumber){
                System.out.print("Found it! The number is "+guess+" in "+attempts+"attempts!");
                break;
            }else if(guess<secretNumber){
                System.out.println(guess+" is too low!");
                low=guess+1;
            }else{
                System.out.println(guess+"is too high!");
                high=guess-1;
            }
        }
    }
}
