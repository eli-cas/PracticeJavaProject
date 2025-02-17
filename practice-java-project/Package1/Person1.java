package Package1;

public class Person1 {
  private String name;
  private int age;

  public Person1(String name, int age) {
    this.name = name;
    this.age = age;
  }

  int counter = 0;

  public void printName() {
    String demoMessage = "demo";
    while(counter < 5) {
      demoMessage = "changed message";
      System.out.println("demo message inside loop is: " + 
      demoMessage + " and counter is: " + counter + " and name is: " + name + " and age is: " + age);
      counter++;
    }

    System.out.println("demo outside of loop is: " + demoMessage);
  }

  public static void main(String[] args) {
    Person1 person1 = new Person1("Anna", 10);
    person1.printName();
  }
}
