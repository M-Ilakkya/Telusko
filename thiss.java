import java.util.*;
class Human {
    private int age;
    private String name;

    public Human(int age, String name) {
        this.age = age;      // current object's age
        this.name = name;    // current object's name
    }

    public void display() {
        System.out.println("Age : " + age);
        System.out.println("Name: " + name);
    }
}

public class thiss {
    public static void main(String[] args) {

        Human h1 = new Human(25, "John");

        h1.display();
    }
}