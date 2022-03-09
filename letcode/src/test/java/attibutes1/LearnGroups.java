package attibutes1;

import org.testng.annotations.Test;

public class LearnGroups {
	@Test(groups= {"a"})
	public void SignUp() {
		System.out.println("sign up");
	}
	@Test (groups = {"b"})
public void Login() {
	System.out.println("login");

	}
	@Test(groups = {"a"})
public void usernameProduct() {
	System.out.println("username product");
}
	@Test(groups = {"b"})
public void AddToCart() {
	System.out.println("add cart");

}
	@Test(groups = {"c"})
public void SignOut() {
	System.out.println("sign out");

}
}
