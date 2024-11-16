package Shubhadip.Axis_Testing1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class RediffLoginAutomate {
	public static void main(String args[]) {
		WebDriver d = new ChromeDriver();
		d.get("https://register.rediff.com/register/register.php?FormName=user_details"); 
		d.manage().window().maximize();
		d.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[3]/td[3]/input")).sendKeys("Shubhadip Paul");
		d.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[7]/td[3]/input[1]")).sendKeys("Shubhadip12345");
		d.findElement(By.xpath("//*[@id=\"newpasswd\"]")).sendKeys("123654789");
		d.findElement(By.xpath("//*[@id=\"newpasswd1\"]")).sendKeys("123654789");
		d.findElement(By.xpath("//*[@id=\"div_altemail\"]/table/tbody/tr[1]/td[3]/input")).sendKeys("Shubhadip123@gmail.com");
		d.findElement(By.xpath("//*[@id=\"mobno\"]")).sendKeys("9685741232");
		d.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[24]/td[3]/input[2]")).click();
		d.findElement(By.xpath("//*[@id=\"country\"]"));
		//Select select= new Select(d.findElement(By.xpath("//*[@id=\"country\"]")));
		//select.selectByIndex(3);
		
		
		Select s = new Select(d.findElement(By.xpath("//*[@id=\"country\"]")));
		s.selectByIndex(3);
	}

}
