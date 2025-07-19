import java.util.LinkedList;
import java.util.Collections;
public class Reverse {
    public static void main(String[] args){
        LinkedList<Integer> numbers=new LinkedList();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
    System.out.println("LinkedList: "+numbers);
        //to reverse the orders
        Collections.reverse(numbers);
    System.out.println("Reversed LinkedList: "+numbers);
    }
}
