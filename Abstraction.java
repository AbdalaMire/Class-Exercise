abstract class Shape {
    // abstract method
    abstract void draw();
}

class Rectangle extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing rectangle");
    }
}

class Circle extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing circle");
    }
}

public class Abstraction {
    public static void main(String args[]) {
        Shape s = new Rectangle();
        s.draw();
        s = new Circle();
        s.draw();
    }
}

//In this example, Shape is an abstract class that defines an abstract method draw(). 
//The Rectangle and Circle classes are concrete classes that extend Shape and provide implementation for the draw() method. 
//In the main() method of the TestAbstraction class, we create an instance of Shape and call the draw() method on it, which calls the implementation of the draw() method in the Rectangle class. 
//We then create an instance of Circle and call the draw() method on it, which calls the implementation of the draw() method in the Circle class. 
//This example demonstrates how abstraction allows us to create a common interface for different implementations.