package Shubhadip.Axis_Testing1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWaitHandaling {
	public static void main(String args[]) {
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://testautomationpractice.blogspot.com/");
		d.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
		//d.manage().timeouts().exp
		System.out.println("It waits its maximum");
	}

}
