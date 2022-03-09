package exceptionhandling;

import java.util.NoSuchElementException;

public class LearnThrowVSThrows {
  public void code() {
	  try {
		Thread.sleep(5000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
  }
 public static void main(String[] args) {
	
	 LearnThrowVSThrows its= new LearnThrowVSThrows();
	 its.code();
	 System.out.println("vanakam chennai");
} 
  
  
  
  
  
  
  
}
