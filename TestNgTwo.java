package Shubhadip.Axis_Testing1;
import org.testng.annotations.*;

public class TestNgTwo {
	@BeforeTest
	public void Beforetestmethod()
	{
		System.out.println("Before test Method");
	}
	@Test
	public void Testmethod()
	{
		System.out.println("Test Method");
	}
	@Test
	public void Smethod()
	{
		System.out.println("S Method");
	}
	@AfterTest
	public void beforemethod() 
	{
		System.out.println("after test method");
	}
	@BeforeMethod
	public void beforemethod()
	{
		System.out.println("Before Method");
	}
	@AfterMethod
	public void aftertestmethod()
	{
		System.out.println("After Method");
	}
	

}
