import java.io.File;
public class Main {
    public static void main(String[] args)  {
        //create an object of the file
        File file=new File("newFile.text");
        
        try{
            boolean value=file.createNewFile();
            if(value){
                System.out.println("The new file is created");
            }else{
                System.out.println("the file already exists");
            }
        }catch(Exception e){
            e.getStackTrace();
        }
    }  
}
/*
A file is a named location that can be used to store information eg main.java
file class is used to perform various operations on files.
to use a class we have to import it using java.util.io.File
then we can 
 -connect our java program to files
  
-and perfom file operators
after importing java.util.io.File here is how we connect to a file

File file=new File(String filePath);
here we have created the filr object the object is linked with the specified location
filePath.
to create a new file we use createNewFile();
 -returns true if file is created
 -returns false if the file already exists in the specified location
*/