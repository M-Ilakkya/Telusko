import java.util.*;
abstract class Car {

    public abstract void drive();
}

class BMW extends Car {

    public void drive() {
        System.out.println("Driving BMW");
    }
}

public class abs {

    public static void main(String[] args) {

        Car obj = new BMW();

        obj.drive();
    }
}
