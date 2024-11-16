package Shubhadip.Axis_BANK;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumOne {
	public static void main(String args[]) {
		WebDriver d = new ChromeDriver();
		System.out.println("Browser is opend");
		d.get("https://mail.rediff.com/cgi-bin/login.cgi");
		System.out.println("Chrome Has Opened");
	}

}
