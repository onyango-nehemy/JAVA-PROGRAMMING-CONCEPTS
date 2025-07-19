import java.util.HashMap;
public class Hashmap {
    public static void main(String[] args){
     /*   //create an object of Hashmap
        HashMap<Integer,String> students=new HashMap();
        //add elements using put() method;
        students.put(1,"Jack");
        students.put(2,"Jill");
        students.put(5,"Miller");
    System.out.println("Students: "+students);
       // now access elemnt with key5
       String value=students.get(5);
    System.out.println("Accessed student value: "+value);*/
     
       HashMap<Integer,String> languages=new HashMap();
         //add elements
        languages.put(1,"Java");
        languages.put(2,"Python");
        languages.put(3,"C");
    System.out.println("Original HashMap: "+languages);
       //update the element with key 2
        languages.replace(3,"C++");
    System.out.println("Updated HashMap: "+languages);
      //remove last element
      String value=languages.remove(3);
    System.out.println("Removed elemnt: "+value);
    System.out.println("Updated HashMap: "+languages);
    // itrerate through hashmap using for-each
        for(Integer key:languages.keySet()){
            System.out.println(key+":"+languages.get(key));
        }
    }
    
}
