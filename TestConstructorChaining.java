class Parent{
    int quantity=10;
    Parent(){
        System.out.println("Inside Parent default constructor");
    }
    Parent(String message){
        System.out.println("Inside Parent parameterized constructor"+message);
    }
    void printParent(){
         System.out.println("Inside printParent");
    }
}
class Child extends Parent{
    int quantity=20;
    Child(){
        System.out.println("Inside Child default constructor");
    }
    Child(String message){
        super(message);
        System.out.println("Inside Child parameter constructor"+message);
    }
    void printQuantity(){
        System.out.println("quantity of Child="+quantity);
         System.out.println("quantity of Parent="+super.quantity);
    }
    void printChild(){
         System.out.println("Inside printChild");
         super.printParent();
    }
}
public class TestConstructorChaining{
    public static void main(String[] ar){
        Child c1=new Child();
        // Child c2=new Child("Hello");
       c1.printChild();
         //c1.printQuantity();
    }
}