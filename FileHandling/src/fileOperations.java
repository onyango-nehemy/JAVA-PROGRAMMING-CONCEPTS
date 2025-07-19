import java.io.FileReader;
public class fileOperations {
    public static void main(String[] args){
        char[] contents=new char[100];
        
        try{
            FileReader input=new FileReader("testFile.text");
            //read characters
            
            input.read(contents);
            System.out.println("Data in the file: ");
            
            //close the reader
            input.close();
        }catch(Exception e){
            e.getStackTrace();
        }
    }
}
/*
operations of a file 
  -Read a File
  -Write to a File
  -Delete a File
we must import a file reader
*/