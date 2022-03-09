package java_interviewOA;

public class swapTwoNumbers {
public static void main(String[] args) {
	// without using third variable  
	int myage =21;
	int myDadAge = 55;
//	System.out.println("my age :"+ myage+"my Dad age :"+myDadAge);
//	
//	myage= myage- myDadAge;
//	
//	myDadAge= myage+ myDadAge;
//
//	myage= myDadAge -myage;
//	System.out.println("my age :"+ myage+"my Dad age :"+myDadAge);
	// using third variable
	int others= myage;
	 myage= myDadAge;
	myDadAge= others;
	System.out.println("**********************************");
	System.out.println("my age:"+  myage +"my Dad age :"+myDadAge);
}
}
