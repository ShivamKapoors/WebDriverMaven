package TestCases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Test_Drag_And_Drop {

	public static void main(String[] args) 
	{
	
		ChromeDriver	driver = new ChromeDriver();
		driver.get("https://jqueryui.com/resources/demos/droppable/default.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement dropped=driver.findElement(By.xpath("//*[@id=\"droppable\"]"));
		WebElement draggable=driver.findElement(By.xpath("//*[@id=\"draggable\"]"));
		new Actions(driver).dragAndDrop(draggable,dropped ).perform();
	}

}
// https://deluxe-menu.com/popup-mode-sample.html