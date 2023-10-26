package JavaBasics2;


public class Employee extends Person {

  private double salary;


  public Employee(String name, int age, double salary) {
    super(name, age);
    this.salary = salary;
  }


  public double getSalary() {
    return salary;
  }

  public void setSalary(double salary) {
    this.salary = salary;
  }


  public String speak() {
    return "My name is " + getName() + " and my salary is " + getSalary();
  }

}
