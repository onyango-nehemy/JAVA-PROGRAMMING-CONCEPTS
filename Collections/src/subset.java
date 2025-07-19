import java.util.HashSet;
public class subset {
    public static void main(String[] args){
        HashSet<Integer> setA=new HashSet();
        
        setA.add(1);
        setA.add(2);
        setA.add(3);
    System.out.println("SetA: "+setA);
    
        HashSet<Integer> setB=new HashSet();
        
        setB.add(2);
        setB.add(3);
    System.out.println("SetB: "+setB);
    
    //to check if set B is a Subset of SetA
    
       boolean result=setA.containsAll(setB);
       
       if(result){
           System.out.println("setB is a subset of setA");
       }else{
           System.out.println("setB is not a subset od setA");
       }
    }
}
