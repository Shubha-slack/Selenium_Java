package Shubhadip.Axis_Testing1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumEx1 {
	public static void main(String args[]) throws InterruptedException{
		WebDriver d = new ChromeDriver();
		d.get("https://testautomationpractice.blogspot.com/");
		d.manage().window().maximize();
		d.findElement(By.xpath("//*[@id=\"confirmBtn\"]")).click();
		
		//d.findElement(By.linkText("Public Notice Dated 09/10/2024 : (REVISED, exam Date: 14/12/2024), CTET Dec-2024")).click();
		//*[@id="alertBtn"]//*[@id="alertBtn"]
		
		
		Alert alert = d.switchTo().alert(); // ****This Is Important .
		Thread.sleep(5000);
		String alertmsg = alert.getText();
		System.out.println("alertmsg");
		alert.accept(); // Accepting the alert.
		String text1 = d.findElement(By.xpath("//*[@id=\"Blog1\"]/div[1]/div/div/div/div[1]/h3")).getText();
		System.out.println("")
		//alert.dismiss(); // For Cancel or dismiss the Action.	
		
	}

}
