
package ChallengeTwo;

import java.util.HashMap;
import java.util.Collections;
import java.util.ArrayList;

public class Library {
    public static void main(String[] args){
        //create an object known as books
        HashMap<String,String> books=new HashMap<>();
        
        //add books to the library
        books.put("ISBN123", "Java Programming");
        books.put("ISBN124", "Python Programming");
    System.out.println("The Available books:");
        for(String key:books.keySet()){
            System.out.println(key+":"+books.get(key));
        }
    
        //create an arraylist of borrowed books
        ArrayList<String> borrowedBooks=new ArrayList();
        borrowedBooks.add("Java Programming");
    System.out.println("Borrowed Books: "+borrowedBooks);
    }
    
}
