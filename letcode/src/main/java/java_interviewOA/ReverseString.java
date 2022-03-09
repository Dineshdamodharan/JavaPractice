package java_interviewOA;

public class ReverseString {
	public static void main(String[] args) {
		
	
// using string buffer
	
		// TODO Auto-generated method stub
		/*
		 * String given ="dinesh"; StringBuffer buffer = new StringBuffer();
		 * buffer.append(given); System.out.println( buffer.reverse());
		 */
	

		// TODO Auto-generated method stub
     String given1= "agni";
      char[]  chararray = given1.toCharArray();
      String reversed ="";
      for (int i = 3; i >=0; i--) {
		reversed = reversed + chararray;
	}
      System.out.println(reversed);
	}
	}

	