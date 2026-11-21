import java.util.*;
class Human{
   private int age;
   private String name;
   public int getAge() {
    return age;
   }
   public void setAge(int age) {
    this.age = age;// first age is instance variabke and second age is local variable
   }
   public String getName() {
    return name;
   }
   public void setName(String name) {
    this.name = name;
   }
   
   

   
}
public class enc{
    public static void main(String[] args){
        Human obj=new Human();
        obj.getName();
        obj.setName("John");
        obj.getAge();
        obj.setAge(25);   
        System.out.print(obj.getName()+":"+obj.getAge());



        // we cant do it obj.age=11;

    }

    
    }
