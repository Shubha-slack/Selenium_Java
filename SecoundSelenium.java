package Shubhadip.Axis_Testing1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class SecoundSelenium {
	public static void main(String args[]) {
	    	WebDriver d = new ChromeDriver();
	    	d.get("https://mail.rediff.com/cgi-bin/login.cgi");
	    	d.manage().window().maximize();
	    	d.findElement(By.id("login1")).sendKeys("Prerona");
	    	d.findElement(By.id("password")).sendKeys("prerona1913");
	}

}
