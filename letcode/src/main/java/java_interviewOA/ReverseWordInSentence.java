package java_interviewOA;

;


public class ReverseWordInSentence {
	public static void main(String[] args) {
		
		String given = "i love java";
        String reversed ="";
       String[] temp = given.split(" ");
        System.out.println(temp.length);
        System.out.println(temp[1]);
        for (int i = temp.length-1; i >=0; i--) {
			reversed = reversed+temp[i]+" ";
		}
        System.err.println(reversed);
	}       
}
