class Human {
    private final String name;
    private final int age;

    public Human(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void eat() {
        System.out.println("Human eat food.");
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}

class Man extends Human {
    private final String Food;
    private String food;

    public Man(String name, int age, String breed) {
        super(name, age);
        this.Food = food;
    }

    @Override
    public void eat() {
        System.out.println("Man eats Human food.");
    }

    public String getBreed() {
        return Food;
    }
}

public class inheritence {
    public static void main(String[] args) {
        Man m = new Man("Abdi", 25, "German Shdpherd");
        System.out.println("Name: " + m.getName());
        System.out.println("Age: " + m.getAge());
        System.out.println("bread: " + m.getBreed());
        m.eat();
    }
}

//In this example, the Dog class inherits from the Animal class.
//The Dog class has access to all of the fields and methods in the Animal class, and can also have its own fields and methods. 
//The Dog class also overrides the eat() method from the Animal class, which is done using the @Override annotation.
//And when we run the main method, it will give the output as Name: Max, Age:5 and Man eats Human food.