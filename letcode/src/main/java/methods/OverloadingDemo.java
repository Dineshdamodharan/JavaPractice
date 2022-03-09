package methods;


public class OverloadingDemo {
static int method(int x,int y) {
	 ;
	return  x+y;
}
static double method(double x,double y) {
	return x+y;
	
}
public static void main(String[] args) {
	int n= method(4, 6);
	double m= method(4.5, 5.5);
	System.out.println(n);
	System.out.println(m);
}

}
