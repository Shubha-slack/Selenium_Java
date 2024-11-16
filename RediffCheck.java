package Shubhadip.Axis_Testing1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class RediffCheck {
	public static void main(String args[]) throws InterruptedException{
		WebDriver d = new ChromeDriver();
		d.get("https://testautomationpractice.blogspot.com/");
		d.manage().window().maximize();
		/*d.findElement(By.xpath("//*[@id=\"confirmBtn\"]")).click();
		Select s = new Select(d.findElement(By.xpath(//*[@id=\"country\"])));
		Select dropdown = new Select(d.findElement(By.xpath("//*[@id=\"country\"]")));
		dropdown.selectByIndex(2);*/
		//d.findElement(By.xpath("//*[@id=\"country\"]"));
		  /*Select select= new Select(d.findElement(By.xpath("//*[@id=\"country\"]")));
		  select.selectByIndex(9);*/
		Select select = new Select(d.findElement(By.xpath("//*[@id=\"country\"]")));
		select.selectBy
		
	}

}
