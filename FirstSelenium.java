package Shubhadip.Axis_Testing;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstSelenium {
	public static void main(String args[]) {
		WebDriver d =  new ChromeDriver();
		System.out.println(" Browser Is Opend");
		d.get("https://mail.rediff.com/cgi-bin/login.cgi");
		System.out.println("Chrome Is Opend");
		
		
	}

}
