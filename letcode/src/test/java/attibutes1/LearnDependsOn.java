package attibutes1;


import org.testng.annotations.Test;

public class LearnDependsOn {
	
	@Test(dependsOnMethods = "APIStudentLogin")
	public void WebStudentLogin() {
		System.out.println("student login through web");
	}
@Test
	public void MobileStudentlogin() {
		System.out.println("student login through mobile");
	}

	@Test
public void APIStudentLogin() {
		
	System.out.println("student login through API");
	
	
}
	
}
