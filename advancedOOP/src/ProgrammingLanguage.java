/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author MBANI NEHEMY
 */
class ProgrammingLanguage  implements Language{
    //abstract method
    public void getName(String name){
        System.out.println("Language: "+name);
    }   
    public static void main(String[] args){
        ProgrammingLanguage language=new ProgrammingLanguage();
        language.getName("Java");
            
    }
    
    
}
