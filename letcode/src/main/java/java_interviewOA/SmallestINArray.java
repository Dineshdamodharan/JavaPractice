package java_interviewOA;

import java.util.Arrays;

public class SmallestINArray {
     int [] given = {16,13,12,44,100,05};
     //USING ARRAYS SORT
//     public void UsingArrays() {
//     Arrays.sort(given);
//    	 System.out.println(given[0]);
//     }
     
     //WITHOUT USING ARRAYS
    public void usingLoop(){
     int smallest = Integer.MAX_VALUE;
   for (int i = 0; i< given.length; i++) {
	

		if (given[i]<smallest) {
			smallest = given[i];
		}
	}System.out.println("smallest number :"+ smallest);
     }
     public static void main(String[] args) {
		SmallestINArray SmallestINArray = new SmallestINArray();
		//SmallestINArray.UsingArrays();
		SmallestINArray.usingLoop();
	}
}
