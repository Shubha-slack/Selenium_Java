package Shubhadip.Axis_Testing1;
import org.testng.annotations.Test;

public class TestNgOne {
	
	@Test(priority=0)
	public void methodB()
	{
		System.out.println("B is Called");
	}
	@Test
	public void methodA()
	{
		System.out.println("A  is Called");
	}
	@Test
	public void method1()
	{
		System.out.println("1  is Called");
	}
	@Test
	public void method2()
	{
		System.out.println("a  is Called");
	}
	@Test(priority=-35)
	public void shubhadipX()
	{
		System.out.println("X  is Called");
	}
	@Test(priority=-20000000)
	public void methodY()
	{
		System.out.println("L  is Called");
	}
	@Test(priority=-3)
	public void methodH()
	{
		System.out.println("99  is Called");
	}
}
