package Shubhadip.AxisBank;

public class Politics {
	//Data Member
	
	int black_money = 50000000;
	String name = "Mr.Scammer";
	// method

	void eat()
	{
		System.out.println("They Eat Public Funds!");// Void Method
		System.out.println("The Amount He eat: "+black_money);
	}
	void fraud() {
		System.out.println(" The Name Of The Politiatian Is: "+name);
		System.out.println("They Do Fraud");
	}
	public static void main(String[] args) {
		Politics politics = new Politics();
		politics.eat();
		politics.fraud();     // Main Method
	}
}

