package inheritence;

public class Demo {

	public static void main(String[] args) {
		
		Dog dog = new Dog();
		pug pug = new pug();
		dog.breed= "germanship";
		dog.name="ramu";
		dog.age=3;
		
		pug.breed= "pug";
		pug.name= "samu";
		pug.age=2;
		pug.cuteness="high";
		pug.bark();
		pug.eat();
		pug.sleep();
	System.out.println(pug.name);		

	}

}
