import java.util.Scanner;
public class Array {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the size ofthe array:");
        int size=scan.nextInt();
        
        int[] array=new int[size];
        
        System.out.println("Enter "+size+" values");
        for(int i=0;i<size;i++){
            array[i]=scan.nextInt();
        }
        
        System.out.println("Array values and indexexs");
        for(int k=0;k<array.length;k++){
            System.out.println(array[k]+" at index: "+k);
        }
        scan.close();


    }
}

