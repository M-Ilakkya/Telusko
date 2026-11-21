import java.util.*;
class Student {
    String name;
    String college = "VCET";
}


public class sta{
        public static void main(String[] args) {

        Student s1 = new Student();
        Student s2 = new Student();

        s1.name = "Ilakkya";
        s2.name = "Ram";
        System.out.println(s1.name + " " + s2.name);
        System.out.println(s1.college+" " + s2.college);

    }
}