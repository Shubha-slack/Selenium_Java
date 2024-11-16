package Shubhadip.Axis_Testing1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropHandleing {
	public static void main(String args[]) {
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.navigate().to("https://testautomationpractice.blogspot.com/");
		WebElement draggable =d.findElement(By.id("draggable"));
		WebElement droppable=d.findElement(By.id("droppable"));
		Actions action = new Actions(d);
		action.dragAndDrop(draggable, droppable);
		System.out.println(" Drag and Drop Performed");
		
	}

}
