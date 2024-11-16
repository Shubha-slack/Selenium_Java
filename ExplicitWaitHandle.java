package Shubhadip.Axis_Testing1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitHandle {
	public static void main(String args[]) {
		WebDriver d =new ChromeDriver();
		d.get("https://www.flipkart.com/");
		d.manage().window().maximize();
		//WebDriverWait wait = new WebDriverWait(d,Duration.ofSeconds(2));
		WebDriverWait wait = new WebDriverWait(d, Duration.ofSeconds(10));
		WebElement w1 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"container\"]/div/div[1]/div/div/div/div/div[1]/div/div/div/div[1]/div[1]/header/div[2]/div[2]/div/div/div/div/a/span")));
		w1.click();
		System.out.println(" Flipkart has opend");
	}

}
