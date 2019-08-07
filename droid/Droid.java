public class Droid {
  //
    int batteryLevel = 100;
    String name;
  
// basic task method
 public void performTask(String task) {
  System.out.println(name + " is doing the honorable task of " + task);
   batteryLevel = batteryLevel - 100;
}   

public void batteryMinusUse() {
  batteryLevel = batteryLevel - 10;
}

 public Droid (String droidName, int battery) {
   	name = droidName;  
   	batteryLevel = battery;
 }
  
// math methods
public void doSomeMath (int x, int y) {
  int prod = x * x + y + x / 3;
  System.out.print("The product of " + x + " squared plus " + x + " plus " + y + " divided by 3 is: " + prod);
}
  
// stringify method
public String toString() {
  return "Hey there, " + name;
}

  public static void main(String[] args) {
    // sample objects
  	Droid Codey = new Droid("Codey", 120);
		// Codey.performTask("cleaning");
    
    Droid Rachel = new Droid("Rachel", 200);
    // System.out.println(Rachel);
    // Rachel.doSomeMath(17, 23);
    Rachel.batteryMinusUse(); // subtracts 10 from battery
    System.out.println(Rachel.batteryLevel);
    Rachel.batteryMinusUse(); // subracts another 10
    System.out.println(Rachel.batteryLevel);
  }
}