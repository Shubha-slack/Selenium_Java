package Shubhadip.Axis_Testing1;

import org.openqa.selenium.By;
//import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstSelenium1 {
	public static void main(String args[]) {
		WebDriver d = new ChromeDriver();
		d.get("https://mail.rediff.com/cgi-bin/login.cgi");
		System.out.println(" Browser is opened");
		d.findElement(By.id("login1")).sendKeys("Shubha1234");
		d.findElement(By.id("password")).sendKeys("12364");
		System.out.println(" Open the username");
	}

}
