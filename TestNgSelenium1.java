package Shubhadip.Axis_Testing1;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;



public class TestNgSelenium1 {
	WebDriver d;
	
	@BeforeTest
	
void Beforetest() {
		System.out.println("Before Test Is Ecicuted Successfully");
	}
	
	@AfterTest
	
void Aftertest() {
		System.out.println(" After Test Is Exicuted Successfully");
	}
	@Beforemethod(){
		System.out.println("Before Method Is Exicuted :");
	}
	@Aftermethod()
	void aftermethod()
	{
		System.out.println(" Aftermethod is exicuted" :");
	}
	@Test(priority=0)
void Openbrowser()
	{
		d=new ChromeDriver();
		d.manage().window().minimize();
		
	}
	@Test(priority=-1)
	void LaunchWrbsite() 
	{
		d.navigate().to("https://testautomationpractice.blogspot.com/");
	}
	@Test(priority=1)
void Closewebsite() {
		d.close();
	}

}
