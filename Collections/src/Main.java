import java.util.ArrayList;
public class Main {
    public static void main(String[] args){
        //create an arraylist
        ArrayList<String> languages=new ArrayList<>();
        //add values to the array
        
        languages.add("java");
        languages.add("C#");
        languages.add("C++");
        
     System.out.println("ArrayList: "+languages);
     for(String language:languages){
         System.out.println(language);
     }

    }
}
