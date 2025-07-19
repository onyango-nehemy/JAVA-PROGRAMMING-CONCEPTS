/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author MBANI NEHEMY
 */
public class Rectangle {
    //rectangle fields
    
    int width;
    int height;
    
    //constructor to initiliaze 
    Rectangle(int rect_width,int rect_height){
        this.width=rect_width;
        this.height=rect_height;
    }
    //method
    
    public int getArea(){
        int area=this.width*this.height;
        return area;
    }
    
    public static void main(String[] args){
        //create an objcet
        Rectangle r1=new Rectangle(6,9);
        System.out.println(r1.getArea());
    }
    
}
