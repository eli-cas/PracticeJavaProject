package Package1;

public class Person1 {
  String name = "Eliora";
  static int age = 5;
  int counter = 0;

  public void printName() {
    String demoMessage = "demo";
    while(counter < 5) {
      System.out.println("demo message inside loop is: " + demoMessage);
      counter++;
    }

    System.out.println("demo outside of loop is: " + demoMessage);
  }

  public static void main(String[] args) {
    Person1 person = new Person1();
    person.printName();
   
  }
 
}
