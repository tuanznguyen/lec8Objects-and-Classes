
package lec8Constructor;

public class Studentmangement {
    int id;
    String name;

    Studentmangement(int i, String n) {
        id = i;
        name = n;
    }

    void display() {
        System.out.println(id + " " + name);
    }

    public static void main(String args[]) {
       Studentmangement s1 = new Studentmangement(111, "Karan");
       Studentmangement s2 = new Studentmangement(222, "Aryan");

        s1.display();
        s2.display();
    }
}
