
public class Calculator {
  
  // constructor
  public Calculator () {
  
  }
  
  // add method
  public int add(int a, int b) {
    int sum = a + b;
    return sum;
  }
  
  // subtract method
  public int subtract(int a, int b) {
    int difference = a - b;
    return difference;
  }
  
  // multiply method
  public int multiply(int a, int b) {
    int product = a * b;
    return product;
  }
  
  // divide method
  public int divide(int a, int b) {
    int dividend = a / b;
    return dividend;
  }
  
  // modulo method
  public int modulo(int a, int b) {
    int modulus = a % b;
    return modulus;
  }
  // main
  public static void main(String[] args) {
    System.out.print("This is a basic calculator ");
    Calculator myCalculator = new Calculator();
    //using the add method
    int addition = myCalculator.add(5,7);
    System.out.println("The Sum is " + addition);
    
    // using the subtract method
    int subt = myCalculator.subract(45, 11);
    System.out.println("The result is " + subt);

  }
}