/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author MBANI NEHEMY
 */
public class Student {
    String name;
    int id;
    
    Student(String student_name,int id){
        System.out.println("The Students Details");
        this.name=student_name;
        this.id=id;
    }
    
    public static void main(String[] args){
        Student s1=new Student("Alice",24);
        System.out.println("Student 1 details: "+s1.name);
        System.out.println("Student 1 details: "+s1.id);
    }
    
}
