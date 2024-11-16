package Shubhadip.Axis_Testing1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
//import org.openqa.selenium.support.ui.Select;


public class SeleniumTest {
	public static void main(String args[]) throws InterruptedException
	{
	  WebDriver w=new ChromeDriver();
	  System.out.println("Open chromeDriver successfully");
	  w.get("https://testautomationpractice.blogspot.com/");
	  System.out.println("Open link successfully");
	  w.manage().window().maximize();
	  w.findElement(By.id("name")).sendKeys("Supriya Togare");
	  w.findElement(By.id("email")).sendKeys("supriyatogare99@gmail.com");
	  w.findElement(By.id("phone")).sendKeys("9579854441");
	  w.findElement(By.id("textarea")).sendKeys("Latur, Maharashtra");
	  w.findElement(By.xpath("//*[@id=\"female\"]")).click();
	  w.findElement(By.xpath("//*[@id=\"post-body-1307673142697428135\"]/div[4]/div[5]/label")).click(); 
	  w.findElement(By.xpath("//*[@id=\"country\"]"));
	  Select select= new Select(w.findElement(By.xpath("//*[@id=\"country\"]")));
	  select.selectByIndex(9);
	}

}
