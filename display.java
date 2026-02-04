/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lec8Constructor;

/**
 *
 * @author OS
 */
public class display {

    public void display(int a) {
        System.out.println("Integer: " + a);
    }

    public void display(double a) {
        System.out.println("Double: " + a);
    }

    public static void main(String[] args) {
        display obj = new display();
        obj.display(5); 
        obj.display(5.0); 
        obj.display(5L); 
    }

}
