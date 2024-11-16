package Shubhadip.Axis_Testing1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHoverHandaling {
	public static void main(String args[]) {
		WebDriver d = new ChromeDriver();
		System.out.println("ChromeDriver is open and Screen is maximized");
		d.manage().window().maximize();
		d.navigate().to("https://testautomationpractice.blogspot.com/");
		WebElement element = d.findElement(By.xpath("//*[@id=\"HTML3\"]/div[1]/div/button"));
		Actions action = new Actions(d);
		action.moveToElement(element).build().perform();		
	}

}
