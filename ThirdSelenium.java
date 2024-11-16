package Shubhadip.Axis_Testing1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ThirdSelenium {
	public static void main(String args[]) throws InterruptedException {
		WebDriver d = new ChromeDriver();
    	d.get("https://mail.rediff.com/cgi-bin/login.cgi");
    	System.out.println("Browser Has open ");
    	d.manage().window().maximize();
    	d.findElement(By.id("login1")).sendKeys("Shubhadip@gmail.com");
    	d.findElement(By.id("password")).sendKeys("Shubhadip9696");
    	d.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[2]/form/div[1]/div[3]/div[2]/span/a/u")).click();
    	d.findElement(By.name("proceed")).click();
    	Thread.sleep(5000);
    	d.findElement(By.linkText("Forgot Password?")).click();
    	
	}

}
