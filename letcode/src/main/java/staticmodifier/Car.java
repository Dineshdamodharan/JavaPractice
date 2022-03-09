package staticmodifier;

public class Car {
 String model; //instant variables
 int cost;
 double mileage;
 static int wheel=4;//static variables
 
public void Startcar() {
	System.out.println(model + "car is starting");
}
public static void Carwheel() {
	System.out.println("no of wheels "+ wheel);
}
}
