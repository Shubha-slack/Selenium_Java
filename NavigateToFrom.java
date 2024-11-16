package Shubhadip.Axis_Testing1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateToFrom {
	public static void main(String args[]) throws InterruptedException {
		WebDriver d= new ChromeDriver();
		d.get("https://testautomationpractice.blogspot.com/2018/09/automation-form.html");
		d.manage().window().maximize();
		d.navigate().to("https://www.pavantestingtools.com/");
		Thread.sleep(5000);
		d.navigate().back();
	}

}
