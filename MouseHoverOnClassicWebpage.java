package Shubhadip.Axis_Testing1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHoverOnClassicWebpage {
	public static void main(String args[]) {
		WebDriver d = new ChromeDriver();
		d.navigate().to("https://www.deltadental.com/");
		d.manage().window().maximize();
		System.out.println("Webpage is Visible");
		WebElement element=d.findElement(By.xpath("/html/body/div[1]/div/div/div[1]/header/div[2]/div/div/div[1]/div/nav/ul/li[2]/a"));
		Actions action=new Actions(d);
		action.moveToElement(element).build().perform();
		System.out.println("Mouse Hover into Memvers Tool");
        WebElement memberFAQ = d.findElement(By.xpath("/html/body/div[1]/div/div/div[1]/header/div[2]/div/div/div[1]/div/nav/ul/li[2]/ul/li[5]/a"));
        action.moveToElement(memberFAQ).click().perform();
        System.out.println("Member FAQ is clicked");
		}

}
