
public class BinarySearch2 {
    static int search(int[] numbers,int target){
        int low=1;
        int high=numbers.length-1;
        int attempts=0;
        
        //BinarySearch
        while(low<=high){
            attempts++;
            int guess=7;
            if(guess==target){
                System.out.println("Found the number: "+guess+" in attempts: "+attempts);
                break;
            }else if(guess<target){
                System.out.println("the number is too high");
                low=guess+1;
            }else if(guess>target){
                System.out.println("the number is low");
                high=guess-1;
            }else{
                System.out.println("enter a valid number");
            }
        }
        return target;
    }
    public static void main(String[] args){
        int[] n={1,3,5,7,9,11,13};
        int k=13;
        search(n,k);
    }
}
