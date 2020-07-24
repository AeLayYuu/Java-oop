package polymorphism;

import java.awt.*;

public class Polymorphism {
    public static void main (String[] args){
        Rectangle rectangle=new Rectangle();
        rectangle.drawing();
        Shape shape= new Rectangle(); //upcasting;
        shape.drawing();
        shape=new Circle();
        shape.drawing();

    }
}
class Shape{
    void drawing(){
        System.out.println("Drawing....");
    }
}
class Circle extends Shape{
    void drawing(){
        System.out.println("Drawing Circle");
    }
}
class Rectangle extends Shape{
    void drawing(){
        System.out.println("Drawing rectangle");
    }
}