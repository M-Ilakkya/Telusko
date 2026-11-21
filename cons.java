import java.lang.*;
class Human{
   private int age;
   private String name;
   public int getAge() {
    return age;
   }
   
   public void setAge(int age) {
    this.age = age;// first age is instance variabke and second age is local variable
   }

   

   

   
   

   
}
public class cons{
    public static void main(String[] args){
        Human obj=new Human(25,"John");
        System.out.print(obj.getName()+":"+obj.getAge());



        // we cant do it obj.age=11;

    }

    
    }

