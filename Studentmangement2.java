
package lec8Constructor;


public class Studentmangement2 {
    int id;
    String name;

    Studentmangement2(int i, String n) {
        id = id;
        name = name;
    }

    void display() {
        System.out.println(id + " " + name);
    }

    public static void main(String args[]) {
       Studentmangement2 s1 = new Studentmangement2(111, "Karan");
       Studentmangement2 s2 = new Studentmangement2(222, "Aryan");

        s1.display();
        s2.display();
    }
}
