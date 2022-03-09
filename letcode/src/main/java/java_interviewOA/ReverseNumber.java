package java_interviewOA;

import java.util.Scanner;

public class ReverseNumber {
      public static void main(String[] args) {
    	  Scanner scanner = new Scanner(System.in);
    	  System.out.println("enter number:");
    	  int given = scanner.nextInt();
//		int given=123;
		int reversed=0;
		while (given!=0) {
			reversed= reversed*10;
			reversed=reversed+given%10;
			given = given/10;
		}
		System.out.println(reversed);
	}
}
