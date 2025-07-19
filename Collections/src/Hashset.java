import java.util.HashSet;
public class Hashset {
    public static void main(String[] args){
      /*  HashSet<Integer> primeNumbers=new HashSet();
        //add elemants to it
        primeNumbers.add(2);
        primeNumbers.add(3);
        primeNumbers.add(5);
    System.out.println("Set1: "+primeNumbers);
        HashSet<Integer> numbers=new HashSet();
        numbers.add(2);
        numbers.add(4);
    System.out.println("Set2: "+numbers);
        
        //the union we use addAll()method
        numbers.addAll(primeNumbers);
    System.out.println("The Union : "+numbers);*/
      //Intersection here
      /*HashSet<Integer> set1=new HashSet();
      set1.add(2);
      set1.add(3);
      set1.add(5);
    System.out.println("Set1: "+set1);
      
      HashSet<Integer> set2=new HashSet();
      set2.add(1);
      set2.add(3);
      set2.add(5);
    System.out.println("Set2: "+set2);
      //use intersection retainAll() method to find a common elements
      
      set1.retainAll(set2);
    System.out.println("Common Elements in both sets: "+set1);*/
      
      //SET DIFFERENCE
      HashSet<Integer> setA=new HashSet();
      setA.add(2);
      setA.add(3);
      setA.add(5);
    System.out.println("SetA: "+setA);
    
      HashSet<Integer> setB=new HashSet();
      setB.add(1);
      setB.add(3);
      setB.add(5);
    System.out.println("SetB: "+setB);
     
    //element present in B but Absent in A
      setB.removeAll(setA);
    System.out.println("element in b but absent in A : "+setB);
      
    }
    
}
