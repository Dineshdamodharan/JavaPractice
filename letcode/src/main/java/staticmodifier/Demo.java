package staticmodifier;



public class Demo {

	public static void main(String[] args) {
		Car bmw = new Car();
		bmw.model="a class";
		bmw.cost =10;
		Car audi= new Car();
		audi.cost=11;
		audi.model="b class";
		System.out.println(bmw.model); // instance variable with object name
		System.out.println(Car.wheel);//static variable with class name
   audi.Startcar();//obj name
   Car.Carwheel();//class name reference for static method
	
	}

}
