package attibutes1;

import static org.testng.Assert.assertThrows;
import static org.testng.Assert.expectThrows;

import org.openqa.selenium.NoSuchElementException;
import org.testng.annotations.Test;

public class AlwaysRunEnablesDescription {
@Test(enabled = false)
	public void SignUP() {
		System.out.println("sign up");
	}
@Test(description = "log in to username")
public void login() {
	System.out.println("login");
   throw new NoSuchElementException("element not there");
}
@Test(dependsOnMethods =" attribute3.AlwaysRunEnablesDescription.login",alwaysRun = true)
public void usernameProduct() {
	System.out.println("username product");
}






}






