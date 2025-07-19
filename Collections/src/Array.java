import java.util.ArrayList;
public class Array {
    public static void main(String[] args){
        ArrayList<String> languages=new ArrayList();
        languages.add("Java");
        languages.add("Python");
        languages.add("C++");
    System.out.println("ArrayList: "+languages);
    //define an array
    String[] arr=new String[languages.size()];
    languages.toArray(arr);
    
    System.out.println("Array elements: ");
    for(String item :arr){
        System.out.println(item);
    }
    }
    
}
