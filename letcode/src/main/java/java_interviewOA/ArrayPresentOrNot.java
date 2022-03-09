package java_interviewOA;

public class ArrayPresentOrNot {
	int []array= {1,2,3,4,5};
	int numbertofind= 3;
	boolean found=false;

	public void PresentOrNot() {
		for (int number : array) {
			if (number==numbertofind) {
				found= true;
				break;
			}
        }
		if (found) {
			System.out.println("element is present");
		} else {
			System.out.println("element is not present");
		}

	}
	public static void main(String[] args) {
		ArrayPresentOrNot ArrayPresentOrNot = new ArrayPresentOrNot();
		ArrayPresentOrNot.PresentOrNot();
	}
}
