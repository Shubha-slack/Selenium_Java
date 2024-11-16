package Shubhadip.Axis_Testing1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Rightclick {
	public static void main (String[] args) {
		WebDriver d=new ChromeDriver ();
		d.get ("https://testautomationpractice.blogspot.com/");
		d.manage ().window() .maximize ();
		WebElement draggable=d.findElement (By.id("draggable"));
		Actions action=new Actions (d);
		action.contextClick(draggable).build().perform();
		System.out.println("right click is performed");
	}

}
