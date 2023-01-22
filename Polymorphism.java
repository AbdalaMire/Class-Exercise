class Shape {
    public void draw() {
        System.out.println("Drawing a shape");
    }
}

class Square extends Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a square");
    }
}

class Circle extends Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a circle");
    }
}

public class Polymorphism {
    public static void main(String[] args) {
        Shape s1 = new Square();
        Shape s2 = new Circle();
        s1.draw(); // Output: Drawing a square
        s2.draw(); // Output: Drawing a circle
    }
}

//In this example, the class Shape is the base class and Square and Circle are subclasses. 
//The draw() method is defined in the base class, but overridden in the subclasses.
//When we create an instance of Square and assign it to a variable of type Shape, it's called upcasting. And when we call the draw() method on this variable, it will call the overridden method in the Square class. 
//Similarly, when we create an instance of Circle and assign it to a variable of type Shape, it will call the overridden method in the Circle class. 
//This is an example of polymorphism, where a single method call can behave differently based on the actual type of the object at runtime.