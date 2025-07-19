import java.util.LinkedList;

public class Queue {
    public static void main(String[] args){
        LinkedList<String> languages=new LinkedList<>();
        //add elements
        
        languages.add("Python");
        languages.add("Java");
        languages.add("Javascript");
    System.out.println("LinkedList: "+languages);
    
    //remove the first elemnent
    
         String str1=languages.poll();
    System.out.println("Removed Element: "+str1);
    //add element at the back
    
        languages.offer("Swift");
    System.out.println("LinkedList after offer: "+languages);
    }
}
