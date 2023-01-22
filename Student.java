public class Student {
    //declaring variables name and roll number
    public String name;
    public int roll_no;    // ques 1 . a
    private double salary;
    private int age;
    
    public Student(String name, int roll_no, double salary1) {  // ques 1 . b
        //initializing the variables name and roll no
        this.name = name;
        this.roll_no = roll_no; 
    }
     //Setters and Getters
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return this.age;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getSalary() {
        return this.salary;
    }
    //Method to calculate total salary
    public double calculateTotalSalary(double... incomes) {
        double total = this.salary;
        for (double income : incomes) {
            total += income;
        }
        return total;
    }
    public static void main(String[] args) {    
        Student s=new Student("Abdi",2, 350);//creating a object for Student class
        System.out.println("Name: " +s.name);
        System.out.println("Roll_no: " +s.roll_no);
        
    }
    //Method overloading
    public double calculateTotalSalary(double income1, double income2) {
        return this.salary + income1 + income2;
    }
    
      //Static method
    public static int getStudentCount() {
        return StudentCount;
    }

    //Object referencing
    public Student createNewStudent(String name, int age, double salary) {
        return new Student(name, age, salary);
    }

    //Calling inside constructors
    public Student(String name, int age) {
        this(name, age, 0);
    }

}

  
