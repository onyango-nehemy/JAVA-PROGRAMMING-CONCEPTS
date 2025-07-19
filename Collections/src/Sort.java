import java.util.ArrayList;
import java.util.Collections;
public class Sort {
    public static void main(String[] args){
        //create an arraylist
        ArrayList<Integer> numbers=new ArrayList();
        numbers.add(2);
        numbers.add(9);
        numbers.add(3);
    System.out.println("Unsorted ArrayList: "+numbers);
       //sort the list
       Collections.sort(numbers);
    System.out.println("Sorted ArrayList: "+numbers);

       //search forspecific element
       int pos=Collections.binarySearch(numbers,3);
    System.out.println("Position of 3: "+pos);
       int max=Collections.max(numbers);
    System.out.println("maximum number: "+max);
    }
    
}
