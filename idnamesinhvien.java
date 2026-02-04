/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lec8Constructor;

/**
 *
 * @author OS
 */
public class idnamesinhvien {

    int id;
    String name;

    void display() {
        System.out.println(id + " " + name);
    }

    public static void main(String[] args) {
        idnamesinhvien s1 = new idnamesinhvien();
        idnamesinhvien s2 = new idnamesinhvien();

        s1.display();
        s2.display();
    }
}
