package attibutes1;

import org.testng.annotations.Test;

public class priorities {
	@Test
public void mango() {
	System.out.println("i am mango");
}
	@Test(priority=2)
public void apple (){

	System.out.println(" i am apple ");
}
	@Test(priority=-1)
public void watermelon() {
	System.out.println("i'm watermelon");
}
}
