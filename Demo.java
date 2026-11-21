        import java.util.*;
        class Calculator{                     //class name 
            int a;//instance variable it can be creaed inside class but outside method
            public int add(int n1,int n2){//method name 
                int r=n1+n2;
                return r;
            }
              
            

        }
        public class Demo{
            public static void main(String[] args){
                int num1=10;
                int num2=20;

                Calculator calc = new Calculator();//creating object of class Calculator
                int result=calc.add(num1,num2);
                System.out.println("The sum is: " + result);

            }
        }