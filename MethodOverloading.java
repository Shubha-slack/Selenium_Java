package Shubhadip.AxisBank;

public class MethodOverloading {

	void mul(int x , int y) {
		System.out.println(x*y);
	}
	void sum( int x , int y, int k , int p) {
		System.out.println(x+y+k+p);
	}
	public static void main(String[] args) {
		
		MethodOverloading m1 = new MethodOverloading();
		m1.mul(3344, 444);
		m1.sum(25, 25, 25, 25);
		
	}
}
