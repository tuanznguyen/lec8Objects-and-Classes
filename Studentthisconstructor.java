
package lec8Constructor;

public class Studentthisconstructor {
    int id;
    String name;

    Studentthisconstructor() {
        System.out.println("default constructor is invoked");
    }


    Studentthisconstructor(int id, String name) {
        this(); 
        this.id = id;
        this.name = name;
    }

    void display() {
        System.out.println(id + " " + name);
    }

    public static void main(String args[]) {
        Studentthisconstructor e1 = new Studentthisconstructor(111, "Karan");
        Studentthisconstructor e2 = new Studentthisconstructor(222, "Aryan");

        e1.display();
        e2.display();
    }
}
