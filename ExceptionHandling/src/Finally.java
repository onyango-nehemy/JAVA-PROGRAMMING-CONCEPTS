
public class Finally {
    public static void main(String[] args){
        int[] arr={1,2,3};
        try{
            System.out.println("Array Elements:");
            for(int i=0;i<=3;i++){
                System.out.println(arr[i]);
            }
        }catch(Exception e){
            System.out.println("you cant access more than array length");
            System.out.println(e.getMessage());
        }finally{
            System.out.println("executed no matter ");
        }
    }
    
}
/*
basuc syntax offinally block is
try{}catch(Exception e){}finally{}
finally block is always executed it doesnt matter whether an exception occurs or not.

1.if try block raises an exception
  -the catch block is excuted then the finally block is excuted.
2.if the try block does not raise an exception
  -the catch block is skipped then finally block is executed

*/