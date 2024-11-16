package Shubhadip.AXIS_BANK;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstSelenium {
	public static void main(String[] args) {
		WebDriver d = new ChromeDriver();
		d.get("https://mail.rediff.com/cgi-bin/login.cgi");
		d.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[2]/form/div[1]/div[3]/div[2]/span/a/u")).click();

	}

}
