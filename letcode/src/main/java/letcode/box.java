package letcode;

public class box {
int length;
int breadth;
int height;

public void Method() {
//System.out.println("length+breadth+heigth");	
System.out.println("area  of box "+length*breadth*height);
}
	public static void main(String[] args) {
		
box blackbox = new box();
box bluebox = new box();
blackbox.length=10;
blackbox.breadth=20;
blackbox.height=2;

bluebox.length=11;
bluebox.breadth=12;
bluebox.height=2;
blackbox.Method();
bluebox.Method();

	}

}
