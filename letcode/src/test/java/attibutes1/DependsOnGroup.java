package attibutes1;

import org.testng.annotations.Test;

public class DependsOnGroup {
	@Test(dependsOnMethods = { "Testcase2","Testcase3"})
	public void TestCase1() {
		System.out.println("test case 1");
	}
@Test
	public void  Testcase2(){
		System.out.println("test case 2");
	}
@Test
	public void Testcase3() {
		System.out.println("test case 3");
	}
}
